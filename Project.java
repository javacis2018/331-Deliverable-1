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
		
        //double[][] loanData = new double[4][100]; //0=ID, 1=loan, 2=interest rate, 3=monthly payment
		
		/*
		 * ID Naming Scheme
		 * 
		 * 
		 */
		
		Customer[] customerData = new Customer[100]; //0=ID, 1=customer
		Contractor[] contractorData = new Contractor[100]; //0=ID, 1=contractor
		Item[] inventory = new Item[100]; //0=ID, 1=item
		Sale[] sales = new Sale[100]; //0=ID, 1=sale
		Vendor[] vendors = new Vendor[100]; //0=ID, 1=vendor
		
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
    	  
    	  switch(select2)
    	  {
    	  case 1:
    		  break;
    	  case 2:
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
    	  
    	  switch(select3)
    	  {
    	  case 1:
    		  break;
    	  case 2:
    		  break;
    	  case 0:
    		  break;
    	  }
    	  break;
          
          
      case 3:
    	break;
    		  
      case 4:
    	  
    	  break;
      case 5:
        
    	  break; 
      case 6:
    	  
    	  break; 
    	  
      case 7:
    	  break;
    	  
      case 8:
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