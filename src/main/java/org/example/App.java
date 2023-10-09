package org.example;

public class App {
    public static void main(String[] args) {
        FacebookFriends facebookFriends = new FacebookFriends();
        String[] friendNames = facebookFriends.getFriendNames();
        System.out.printf(friendNames[1]);
    }
}
