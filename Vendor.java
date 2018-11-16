/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
 * @author Jeremy Snyder
 * @author Akram Choukri
 * 
 * Vendor - This handles Vendor objects that provide Items for sale.
 */

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
    
    public String toString() {
    	return vID + " " + vName +" // " + vAddy + " " + vPhone; 
    }
}
