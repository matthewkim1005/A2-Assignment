package Swing3650;

public interface UserInterface {
     public String getUsername();
     
     public void setUsername(String username);
     
     public int getIDNumber();
     
     public void setIDNumber(int IDNumber);
     
     public String getTweetStatus();
     
     public void setTweetStatus(String message);
     
     public void addFriends(String message);
     
     public String[] getFriends();
}
