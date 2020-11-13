package VisitorPackage;

abstract class IDNumberVisitor{
    private final int IDNumber;
    
    public IDNumberVisitor(final int IDNumber) {
        this.IDNumber = IDNumber;
    }
    
    public int getIDNumber() {
        return IDNumber;
    }
    
    public void accept(IDNumberVisitor visitor) {
    }
}
