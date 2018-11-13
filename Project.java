import java.util.Scanner;

/**
 * 
 */

/**
 * @author kangcs
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int customerCount = 0;
		int contractorCount = 1000;
		int itemCount = 2000;
		int saleCount = 3000;
		int vendorCount = 4000;
		
        //double[][] loanData = new double[4][100]; //0=ID, 1=loan, 2=interest rate, 3=monthly payment
		
		/*
		 * ID Naming Scheme
		 * 
		 * customer > 0 - 999
		 * contractor > 1000 - 1999
		 * item >  2000 - 2999
		 * sale > 3000 - 3999
		 * vendor > 4000 - 4999
		 * 
		 */
		
		Customer[] customerData = new Customer[100];
		Contractor[] contractorData = new Contractor[100];
		Item[] inventory = new Item[100]; 
		Sale[] sales = new Sale[100]; 
		Vendor[] vendors = new Vendor[100]; 
		
		while(true) {
        
        
        int select;
      
      //get input from user  
      System.out.println("\nValley Depot Information System");
      System.out.println("1. Create Customer");
      System.out.println("2. Edit Customer");
      System.out.println("3. Create Inventory Item");
      System.out.println("4. Edit Inventory Item");
      System.out.println("5. Enter Sale");
      System.out.println("6. Print Receipt");
      System.out.println("7. Create Vendor");
      System.out.println("8. Edit Vendor");
      System.out.println("9. Reports");
      System.out.println("0. Exit");
      select = input.nextInt();
      input.nextLine();
      
      switch(select) 
      {
      
      case 1:
          System.out.println("1. Create Individual Customer");
          System.out.println("2. Create Business Customer/Contractor");
          System.out.println("0. Back");
    	  int select2 = input.nextInt();
    	  input.nextLine();
    	  
    	  switch(select2)
    	  {
    	  case 1:
    		  int id = customerCount;
    		  
    		  System.out.println("First Name?");
    		  String firstName = input.nextLine();
    		  System.out.println("Last Name?");
    		  String lastName = input.nextLine();
    		  System.out.println("Address?");
    		  String address = input.nextLine();
    		  
    		  boolean isValid = true;
    		  while(isValid) {
    			  
    		  System.out.println("Phone Number?");
    		  int phoneNumber = input.nextInt();
    		  input.nextLine();
    		  
    		  if(phoneNumber >= 1000000000 && phoneNumber <= 9999999999L) {
    			  
    		  }
    		  
    		  }
    		  System.out.println();
    		  
    		  break;
    	  case 2:
    		  int id2 = contractorCount - 1000;
    		  
    		  /*
    		   * CREATE CONTRACTOR
    		   */
    		  
    		  break;
    	  case 0:
    		  break;
    	  }
    	  
    	  break;
      case 2:
    	  System.out.println("1. Edit Individual Customer");
          System.out.println("2. Edit Business Customer/Contractor");
          System.out.println("0. Back");
    	  int select3 = input.nextInt();
    	  input.nextLine();
    	  
    	  switch(select3)
    	  {
    	  case 1:
    		  
    		  /*
    		   * EDIT CUSTOMER
    		   */
    		  
    		  break;
    	  case 2:
    		  
    		  /*
    		   * EDIT CONTRACTOR
    		   */
    		  
    		  break;
    	  case 0:
    		  break;
    	  }
    	  break;
          
          
      case 3:
    	  
    	  /*
    	   * CREATE ITEM
    	   */
    	  
    	break;
    		  
      case 4:
    	  
    	  /*
    	   * EDIT ITEM
    	   */
    	  
    	  break;
      case 5:
        
    	  /*
    	   * ENTER SALE
    	   */
    	  
    	  break; 
      case 6:
    	  
    	  /*
    	   * PRINT RECEIPT
    	   */
    	  
    	  break; 
    	  
      case 7:
    	  
    	  /*
    	   *  CREATE VENDOR
    	   */
    	  break;
    	  
      case 8:
    	  
    	  /*
    	   * EDIT VENDOR
    	   */
    	  break;
          
      case 9:
    	  
    	  /*
    	   * PURCHASE HISTORY FOR CUSTOMER
    	   */
    	  
    	  /*
    	   * PURCHASE HISTORY FOR ITEMS
    	   */
    	  
    	  /*
    	   * CURRENT INVENTORY LEVELS
    	   */
    	  
    	  break;
    	  
      case 0:
    	  System.exit(0);
    	  break;
      default:
    	  System.out.println("Error. Unrecognized input.");
      }
		}
    }

}