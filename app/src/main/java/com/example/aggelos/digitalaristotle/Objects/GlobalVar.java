package com.example.aggelos.digitalaristotle.Objects;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class GlobalVar extends RealmObject {

    @PrimaryKey
    private String ID;
    private String lastVideoID;

    public GlobalVar() {}

    public GlobalVar(String ID, String VideoID) {
        this.ID = ID;
        this.lastVideoID = VideoID;
    }

    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID;}

    public String getLastVideoID() { return lastVideoID; }
    public void setLastVideoID(String lastVideoID) { this.lastVideoID = lastVideoID; }
}
