package VisitorPackage;

public interface UserInterfaceVisitor {
    void visit(String Username);
    
    void visit(int IDNumber);
    
    void visit(String[] friends);
}
