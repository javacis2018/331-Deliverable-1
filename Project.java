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
		
		Customer[] customerData = new Customer[1000];
		Contractor[] contractorData = new Contractor[1000];
		Item[] inventory = new Item[1000]; 
		Sale[] sales = new Sale[1000]; 
		Vendor[] vendors = new Vendor[1000]; 
		
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
    		  long phone = 0;
    		  
    		  System.out.println("First Name?");
    		  String firstName = input.nextLine();
    		  System.out.println("Last Name?");
    		  String lastName = input.nextLine();
    		  System.out.println("Address?");
    		  String address = input.nextLine();
    		  
    		  boolean isValid = true;
    		  while(isValid) {
    			  
    		  System.out.println("Phone Number?");
    		  phone = input.nextLong();
    		  input.nextLine();
    		  
    		  if(phone >= 1000000000 && phone <= 9999999999L) {
    			  isValid = false;
    		  } else {
    			  System.out.println("Invalid input, try again.");
    		  }
    		  
    		  }
    		  System.out.println("Email Address?");
    		  String email = input.nextLine();
    		  
    		  customerData[id] = new Customer(firstName, lastName, address,
    			        phone, email);
    		  customerCount++;
    		  
    		  break;
    	  case 2:
    		  int id2 = contractorCount;
    		  
    		  long phone2 = 0;
    		  
    		  System.out.println("First Name?");
    		  String firstName2 = input.nextLine();
    		  System.out.println("Last Name?");
    		  String lastName2 = input.nextLine();
    		  System.out.println("Business Name?");
    		  String busName = input.nextLine();
    		  System.out.println("Business Address?");
    		  String address2 = input.nextLine();
    		  System.out.println("Contractor Number?");
    		  int cnum = input.nextInt();
    		  input.nextLine();
    		  
    		  boolean isValid2 = true;
    		  while(isValid2) {
    			  
    		  System.out.println("Phone Number?");
    		  phone2 = input.nextLong();
    		  input.nextLine();
    		  
    		  if(phone2 >= 1000000000 && phone2 <= 9999999999L) {
    			  isValid2 = false;
    		  } else {
    			  System.out.println("Invalid input, try again.");
    		  }
    		  
    		  }
    		  System.out.println("Email Address?");
    		  String email2 = input.nextLine();
    		  
    		  //customerData[id] = new Customer(firstName, lastName, address,
    			//        phone, email);
    		 // customerCount++;
    		  
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
    	   * CREATE ITEM (TYLER)
    	   */
    	  
    	break;
    		  
      case 4:
    	  
    	  /*
    	   * EDIT ITEM
    	   */
    	  
    	  break;
      case 5:
        
    	  /*
    	   * ENTER SALE (AKRAM)
    	   */
    	  
    	  break; 
      case 6:
    	  
    	  /*
    	   * PRINT RECEIPT (AKRAM)
    	   */
    	  
    	  break; 
    	  
      case 7:
    	  
    	  /*
    	   *  CREATE VENDOR (JEREMY)
    	   */
    	  break;
    	  
      case 8:
    	  
    	  /*
    	   * EDIT VENDOR
    	   */
    	  break;
          
      case 9:
    	  
    	  /*
    	   * PURCHASE HISTORY FOR CUSTOMER (TYLER)
    	   */
    	  
    	  /*
    	   * PURCHASE HISTORY FOR ITEMS (AKRAM)
    	   */
    	  
    	  /*
    	   * CURRENT INVENTORY LEVELS (JEREMY)
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