package com.example.aggelos.digitalaristotle.Objects;

import io.realm.Realm;
import io.realm.RealmObject;

public class YouTubeVideo extends RealmObject {

    private int rating;
    private int videoID;
    private String category;

    public YouTubeVideo() {

    }

    public YouTubeVideo (int videoID, String category) {
        rating = 0;
        this.videoID = videoID;
        this.category = category;
    }

    public void addRating() { rating++; }
    public void minRating() { rating--; }
}
