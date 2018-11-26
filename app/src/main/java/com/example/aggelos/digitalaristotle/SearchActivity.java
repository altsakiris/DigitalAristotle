package com.example.aggelos.digitalaristotle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.aggelos.digitalaristotle.Objects.VideoItem;
import com.example.aggelos.digitalaristotle.Objects.YouTubeVideo;
import com.example.aggelos.myapplication.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class SearchActivity extends AppCompatActivity {

    private EditText searchInput;
    private ListView videosFound;

    private Handler handler;
    String category;

    private List<VideoItem> searchResults;
    private List<VideoItem> sortedResults = new ArrayList<VideoItem>();
    private List<VideoItem> unsortedResults = new ArrayList<VideoItem>();

    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();
        String searchParameters = intent.getStringExtra("searchQuery");
        realm = Realm.getDefaultInstance();
        category = intent.getStringExtra("category");

        searchOnYoutube(searchParameters);

        searchInput = (EditText)findViewById(R.id.search_input);
        videosFound = (ListView)findViewById(R.id.videos_found);

        handler = new Handler();

        searchInput.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_DONE){
                    searchOnYoutube(v.getText().toString());
                    return false;
                }
                return true;
            }
        });

        addClickListener();
    }

    private void searchOnYoutube(final String keywords){
        new Thread(){
            public void run(){
                YoutubeConnector yc = new YoutubeConnector(SearchActivity.this);
                searchResults = yc.search(keywords);

                Realm realmTh = Realm.getDefaultInstance();

                for (VideoItem videoFound : searchResults) {
                    YouTubeVideo videoRealm = realmTh.where(YouTubeVideo.class)
                                                    .equalTo("videoID", videoFound.getId())
                                                    .and()
                                                    .equalTo("category", category).findFirst();
                    if (videoRealm != null)
                    {
                        sortedResults.add(videoFound);
                    }
                    else
                    {
                        unsortedResults.add(videoFound);
                    }
                }

                int[] ratings = new int[sortedResults.size()];
                for (int i = 0; i < sortedResults.size(); i++) {
                    ratings[i] = realmTh.where(YouTubeVideo.class)
                            .equalTo("videoID", sortedResults.get(i).getId())
                            .and()
                            .equalTo("category", category).findFirst().getRating();
                }

                //insertion sort

                int i, j, temp;
                for (i = 1; i < ratings.length; i++) {
                    VideoItem tempVideoItem;

                    j = i - 1;
                    while (j >= 0 && ratings[j] < ratings[i]) {
                        temp = ratings[i];
                        tempVideoItem = sortedResults.get(i);

                        ratings[i] = ratings[j];
                        VideoItem replaceItem2 = sortedResults.get(j);
                        sortedResults.remove(i);
                        sortedResults.add(i, replaceItem2);

                        ratings[j] = temp;
                        sortedResults.remove(j);
                        sortedResults.add(j, tempVideoItem);
                        i = j;
                        j--;
                    }
                }
                sortedResults.addAll(unsortedResults);

                handler.post(new Runnable(){
                    public void run(){
                        updateVideosFound();
                    }
                });
            }
        }.start();
    }

    private void updateVideosFound(){
        ArrayAdapter<VideoItem> adapter = new ArrayAdapter<VideoItem>(getApplicationContext(), R.layout.video_item, sortedResults){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                if(convertView == null){
                    convertView = getLayoutInflater().inflate(R.layout.video_item, parent, false);
                }
                ImageView thumbnail = (ImageView)convertView.findViewById(R.id.video_thumbnail);
                TextView title = (TextView)convertView.findViewById(R.id.video_title);
                TextView description = (TextView)convertView.findViewById(R.id.video_description);

                VideoItem searchResult = sortedResults.get(position);

                Picasso.with(getApplicationContext()).load(searchResult.getThumbnailURL()).into(thumbnail);
                title.setText(searchResult.getTitle());
                description.setText(searchResult.getDescription());
                return convertView;
            }
        };
        videosFound.setAdapter(adapter);
    }

    private void addClickListener(){
        videosFound.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> av, View v, int pos,
                                    long id) {
                String videoID = sortedResults.get(pos).getId();
                Realm realm = Realm.getDefaultInstance();

                YouTubeVideo result = realm.where(YouTubeVideo.class)
                                            .equalTo("videoID", videoID)
                                            .and()
                                            .equalTo("category", category)
                                            .findFirst();

                if (result == null) {
                    realm.beginTransaction();
                    YouTubeVideo video = realm.createObject(YouTubeVideo.class);
                    video.setCategory(category);
                    video.setVideoID(videoID);
                    video.setRating(0);
                    realm.commitTransaction();
                }

                Intent intent = new Intent(getApplicationContext(), PlayerActivity.class);
                intent.putExtra("VIDEO_ID", videoID);
                intent.putExtra("category", category);
                startActivity(intent);
            }

        });
    }
}