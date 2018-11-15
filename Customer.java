

public class Customer {

// Data fields   
public int custID;    
public String firstName;     
public String lastName;
private String address;
public int phoneNumber;
public String emailAddress;

String[][] custArray = new String[5][];




// Constructors    
public Customer()
{
    this.firstName = "noFName";
    this.lastName = "noLName";
    this.address = "noAddress";
    this.phoneNumber = 0;
    this.emailAddress = "noEmail";
    
}     
        
public Customer(int custID,String firstName, String lastName, String address, int
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



}// End of class
