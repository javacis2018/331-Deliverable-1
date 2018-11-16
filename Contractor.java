/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
 * @author Jeremy Snyder
 * @author Akram Choukri
 * 
 * Contractor - This class extends Customer and adds additional information
 * for contractor objects.
 */

public class Contractor extends Customer {

public int contractorNumber;
public String businessName;
public String businessAddress;

// Constructors
public Contractor()
{
    super();
    this.contractorNumber = 0;
    this.businessName = "noName";
    this.businessAddress = "noAddress";
}

public Contractor(String firstName, String lastName, long
        phoneNumber, String emailAddress, int contractorNumber, String businessName, String 
        businessAddress)
{
	super(firstName, lastName,
	        phoneNumber, emailAddress);
    this.contractorNumber = contractorNumber;
    this.businessName = businessName;
    this.businessAddress = businessAddress;
    
}    

public Contractor(int contractorNumber, String businessName, String 
        businessAddress)
{
    
    this.contractorNumber = contractorNumber;
    this.businessName = businessName;
    this.businessAddress = businessAddress;
    
}    
    
public String toString() {
	return firstName + " " + lastName + ","+ businessName + " // " + businessAddress + " // " + phoneNumber + " // " + emailAddress;
}
    
}// End of class
