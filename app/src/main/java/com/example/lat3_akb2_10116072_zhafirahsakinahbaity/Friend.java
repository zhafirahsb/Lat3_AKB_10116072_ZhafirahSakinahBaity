package com.example.lat3_akb2_10116072_zhafirahsakinahbaity;
import android.widget.ImageView;

public class Friend {

    private String friendName;
    private int friendImg;

    public Friend(String friendName, int friendImg) {
        this.friendName = friendName;
        this.friendImg = friendImg;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public void setFriendImg(int friendImg) {
        this.friendImg = friendImg;
    }

    public String getFriendName() {
        return friendName;
    }

    public int getFriendImg() {
        return friendImg;
    }
}
