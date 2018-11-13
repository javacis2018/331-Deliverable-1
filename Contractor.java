package GroupProject;

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


public Contractor(int contractorNumber, String businessName, String 
        businessAddress)
{
    
    this.contractorNumber = contractorNumber;
    this.businessName = businessName;
    this.businessAddress = businessAddress;
    
}    
    

    
}// End of class
