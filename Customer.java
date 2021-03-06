/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
 * 
 * Customer - Customer objects are defined by this class.
 */

public class Customer {

// Data fields   
public int custID;    
public String firstName;     
public String lastName;
public String address;
public long phoneNumber;
public String emailAddress;

//String[][] custArray = new String[5][];




// Constructors    
public Customer()
{
    this.firstName = "noFName";
    this.lastName = "noLName";
    this.address = "noAddress";
    this.phoneNumber = 0;
    this.emailAddress = "noEmail";
    
}     

public Customer(String firstName, String lastName, String address, long
        phoneNumber, String emailAddress) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.address = address;
}
public Customer(int custID, String firstName, String lastName, long
        phoneNumber, String emailAddress) {
	this.custID = custID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.address = "noAddress";
}       

public Customer(String firstName, String lastName, long
        phoneNumber, String emailAddress) {

    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.address = "noAddress";
}       
public Customer(int custID,String firstName, String lastName, String address, long
        phoneNumber, String emailAddress)
{
    this.custID = custID;
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
}

// Function to retrieve address
public String getAddress()
{
    return this.address;
}

public String toString() {
	return custID + " // " + firstName + " " + lastName + ", " + address + ", " + phoneNumber + ", " + emailAddress;
}


}// End of class
