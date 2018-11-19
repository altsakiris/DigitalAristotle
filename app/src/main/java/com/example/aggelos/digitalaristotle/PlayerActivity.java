package com.example.aggelos.digitalaristotle;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.aggelos.digitalaristotle.Objects.YouTubeVideo;
import com.example.aggelos.myapplication.R;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import io.realm.Realm;

public class PlayerActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    private YouTubePlayerView playerView;
    Realm realm;
    String category;
    String videoID;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        realm = Realm.getDefaultInstance();
        category = intent.getStringExtra("category");
        videoID = intent.getStringExtra("VIDEO_ID");

        setContentView(R.layout.activity_player);

        playerView = (YouTubePlayerView)findViewById(R.id.player_view);
        playerView.initialize(YoutubeConnector.KEY, this);
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult result) {
        Toast.makeText(this, getString(R.string.failed), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
                                        boolean restored) {
        if(!restored){
            player.cueVideo(videoID);
        }
    }

    @Override
    public void onBackPressed() {
        YouTubeVideo video = realm.where(YouTubeVideo.class)
                .equalTo("videoID", videoID)
                .equalTo("category", category)
                .findFirst();

        new AlertDialog.Builder(this)
                .setIcon(R.drawable.baseline_notification_important_black_24)
                .setTitle("Αξιολόγηση Βίντεο")
                .setMessage("Πιστεύετε πως το βίντεο σας βοήθησε στην κατανόηση του αντικειμένου;")
                .setPositiveButton("ΝΑΙ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // vale +1 sth bash
                        realm.executeTransactionAsync(new Realm.Transaction() {
                                                          @Override
                                                          public void execute(Realm bgRealm) {
                                                              YouTubeVideo video = bgRealm.where(YouTubeVideo.class)
                                                                      .equalTo("videoID", videoID)
                                                                      .and()
                                                                      .equalTo("category", category)
                                                                      .findFirst();
                                                              video.addRating();
                                                              Log.d("rating", "Rating is now: " + bgRealm.where(YouTubeVideo.class).equalTo("videoID", videoID).and().equalTo("category", category).findFirst().getRating());
                                                          }
                                                      });
                        finish();
                    }
                })
                .setNegativeButton("ΟΧΙ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // vgale 1 apo th vash
                        finish();
                    }
                })
                .setNeutralButton("ΔΕΝ ΞΕΡΩ", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // tipota
                        finish();
                    }
                })
                .setCancelable(true)
                .show();
    }
}