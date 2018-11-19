package com.example.aggelos.digitalaristotle.Objects;

import io.realm.RealmObject;


// categories: phyc, math, comp, chem
public class YouTubeVideo extends RealmObject {

    public int rating;
    public String videoID;
    public String category;

    public YouTubeVideo() {
        rating = 0;
    }

    public YouTubeVideo (String videoID, String category) {
        rating = 0;
        this.videoID = videoID;
        this.category = category;
    }



    public void addRating() { rating++; }
    public void minRating() { rating--; }

    public String getVideoID() {
        return videoID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
