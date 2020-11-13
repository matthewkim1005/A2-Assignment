package VisitorPackage;

abstract class UsernameVisitor{
    private final String username;
    
    public UsernameVisitor(final String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void accept(UsernameVisitor visitor) {
    }
}
