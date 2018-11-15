public class Vendor {
    
    // Vendor Variables
    String vName;
    String vAddy;
    long vPhone;
    int vID;
    
    // Constructor
    public Vendor(String vName, String vAddy,
            long vPhone, int vID) {
        this.vName = vName;
        this.vAddy = vAddy;
        this.vPhone = vPhone;
        this.vID = vID;
    }
    public Vendor(String vName, String vAddy,
            long vPhone){
        this.vName = vName;
        this.vAddy = vAddy;
        this.vPhone = vPhone;
    }
    
}
