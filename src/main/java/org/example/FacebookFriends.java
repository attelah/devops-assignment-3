package org.example;

public class FacebookFriends {
    String[] friendNames;

    public FacebookFriends() {
        this.friendNames = new String[]{
                "Aino", "Eino", "Helmi", "Kalevi", "Lumi"
        };
    }

    public String[] getFriendNames() {
        return friendNames;
    }
}
