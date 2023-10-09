package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

// Positive test
public class FacebookFriendsTest {
    @Test
    public void testGetFriendNames() {
        FacebookFriends facebookFriends = new FacebookFriends();
        String[] friendNames = facebookFriends.getFriendNames();

        assertNotNull(friendNames);
        assertEquals(5, friendNames.length);

        assertEquals("Aino", friendNames[0]);
        assertEquals("Eino", friendNames[1]);
        assertEquals("Helmi", friendNames[2]);
        assertEquals("Kalevi", friendNames[3]);
        assertEquals("Lumi", friendNames[4]);
    }


    // Negative test
    @Test
    public void testGetFriendNamesEmptyArray() {
        FacebookFriends facebookFriends = new FacebookFriends();
        facebookFriends.friendNames = new String[0];

        String[] friendNames = facebookFriends.getFriendNames();
        assertNotNull(friendNames);
        assertEquals(0, friendNames.length);
    }
}