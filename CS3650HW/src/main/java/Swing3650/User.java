package Swing3650;

import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

public class User implements UserInterface{
    private String username;
    private int IDNumber;
    private String tweetStatus;
    private String[] friends = new String[100];
    
    //Constructor
    User(String name, int ID, String tweetStatus) {
            this.username = name;
            this.IDNumber = ID;
            this.tweetStatus = tweetStatus;
    }
    
    public String getUsername() {
            return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getIDNumber() {
        return IDNumber;
    }
    
    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    
    public String getTweetStatus() {
        return tweetStatus;
    }
    
    public void setTweetStatus(String message) {
        tweetStatus = message;
    }
    
    public void addFriends(String message) {
        for (int i = 0; i < 100; i++) {
            if (friends[i] == null) {
                friends[i] = message;
            }
        }
    }
    
    public String[] getFriends() {
        return friends;
    }
}
