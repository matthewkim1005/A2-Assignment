package VisitorPackage;

abstract class FriendsVisitor{
    private final String[] friends;
    
    public FriendsVisitor(final String[] friends) {
        this.friends = friends;
    }
    
    public String[] getUsername() {
        return friends;
    }
    
    public void accept(FriendsVisitor visitor) {
    }
}

