import java.util.Scanner;
/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
 * @author Jeremy Snyder
 * @author Akram Choukri
 * 
 * Project - This file stores most of the core logic for this application.
 */

public class Project {

	public static Scanner input = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
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
		

                //prepopulate Customer objects
                customerData[0] = new Customer("Bob", "Mcdaniels", 5712128900L, "BobM@yahoo.com");
                customerCount++;
                customerData[1] = new Customer("Jacob", "Thomas", 2388330048L, "JakeThomas@aol.com");
                customerCount++;
                customerData[2] = new Customer("Rachel", "Peterson", 5714712993L, "RachP@aol.com");
                customerCount++;
                customerData[3] = new Customer("Tyler", "Joseph", 3010229384L, "TylerJoseph@hotmail.com");
                customerCount++;
                //4 Customers, 10 Items, 3 Vendors, and 5 Sales. 
                //pre populate vendor objects
                vendors[0] = new Vendor("Home Depot", "121 N Loudoun Lane",5712445698L);
                vendorCount++;
                vendors[1] = new Vendor("Lowes", "588 S Grimble Park",2881558383L); 
                vendorCount++;
                vendors[2] = new Vendor("Sony", "1300 W Marshall Blvd",7576447236L); 
                vendorCount++;
                //int id, int count, String itemName, double weight, String description, double salePrice, double pricePaid, Vendor vendor
                //pre populate Item objects
                inventory[0] = new Item(2000, 1000, "Screws", 1.0, "Long neck Screws", 
                5.0, 10.0, vendors[0]);
                itemCount++;
                inventory[1] = new Item(2001, 300, "Hammers", 13.0, "Iron Hammers", 
                30.0, 10.0, vendors[1]);
                itemCount++;
                inventory[2] = new Item(2002, 50, "Laptops", 20.0, "Sony Laptop", 
                300.0, 10.0, vendors[2]);
                itemCount++;
                inventory[3] = new Item(2003, 120, "Drywall", 1.0, "liquid for drywall", 
                15.0, 10.0, vendors[0]);
                itemCount++;
                inventory[4] = new Item(2004, 115, "Cement", 13.0, "chalk for creating cement", 
                20.0, 10.0, vendors[0]);
                itemCount++;
                inventory[5] = new Item(2005, 500, "Short Screws", 1.0, "Short neck Screws", 
                5.0, 10.0, vendors[1]);
                itemCount++;
                inventory[6] = new Item(2006, 20, "Nails", .5, "Long neck Nails", 
                3.0, 10.0, vendors[0]);
                itemCount++;
                inventory[7] = new Item(2007, 10, "TV", 40.0, "Sony TV", 
                450.0, 10.0, vendors[2]);
                itemCount++;
                inventory[8] = new Item(2008, 75, "MousePad", 1.0, "Sony Mousepad", 
                10.0, 10.0, vendors[2]);
                itemCount++;
                inventory[9] = new Item(2009, 400, "2x4 wood block", 13.0, "2x4 plywood blocks", 
                7.0, 10.0, vendors[1]);
                itemCount++;
                
		//int[][] salesData = new int[3][1000]; //0=Sale ID, 1= Item ID, 2=Quantity
		
                
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
      select = nextInt("");
      
      switch(select) 
      {
      
      case 1:
    	  
    	  
          System.out.println("1. Create Individual Customer");
          System.out.println("2. Create Business Customer/Contractor");
          System.out.println("0. Back");
    	  int select2 = nextInt("");
    	  
    	  switch(select2)
    	  {
    	  case 1:
    		  
    		  boolean cont = true;
    		  
    		  while(cont) {
    		  
    		  int id = customerCount;
    		  long phone = 0;
    		  
    		  String firstName = nextLine("First Name?");
    		  String lastName = nextLine("Last Name?");
    		  String address = nextLine("Address?");
    		  
    		  phone = phoneNumber();
    		  
    		  String email = nextLine("Email Address?");
    		  
    		  customerData[id] = new Customer(firstName, lastName, address,
    			        phone, email);
    		  customerCount++;
    		  
                  boolean invalid = true;
    		  
        	  while(invalid) { //the complex "another customer?" loop
            	  System.out.println("Add another individual customer? (Y/N)");
            	  //input.nextLine();
            	  String in = input.nextLine();
            	  	if (in.equals("N") || in.equals("n")) {
            	  		cont = false;
            	  		invalid = false;
            	  	} else if (in.equals("Y") || in.equals("y")) {
            	  		cont = true;
            	  		invalid = false;
            	  	} else {
            	  		System.out.println("Invalid input, try again.");
            	  		invalid = true;
            	  	}
        	  }
    		  
    		  }
    		  
    		  break;
    	  case 2:
    		  
    		  boolean cont2 = true;
    		  
    		  while(cont2) {
    		  
    		  int id2 = contractorCount - 1000;
    		  
    		  long phone2 = 0;
    		  
    		  String firstName2 = nextLine("First Name?");
    		  String lastName2 = nextLine("Last Name?");
    		  String address2 = nextLine("Business Address?");
    		  String busName = nextLine("Business Name?");
    		  int cnum = nextInt("Contractor Number?");
    		  
    		  phone2 = phoneNumber();
    		  String email2 = nextLine("Email Address?");
    		  
    		  contractorData[id2] = new Contractor(firstName2, lastName2, phone2, email2, cnum,busName, address2);
    		 contractorCount++;
    		  
    		 boolean invalid = true;
   		  
       	  while(invalid) { //the complex "another customer?" loop
           	  System.out.println("Add another contractor? (Y/N)");
           	  //input.nextLine();
           	  String in = input.nextLine();
           	  	if (in.equals("N") || in.equals("n")) {
           	  		cont2 = false;
           	  		invalid = false;
           	  	} else if (in.equals("Y") || in.equals("y")) {
           	  		cont2 = true;
           	  		invalid = false;
           	  	} else {
           	  		invalid = true;
           	  	System.out.println("Invalid input, try again.");
           	  	}
       	  }
   		  
   		  }
    		 
    		  break;
    	  case 0:
    		  break;
    	  }
    	  
    	  break;
      case 2:
    	  System.out.println("1. Edit Individual Customer");
          System.out.println("2. Edit Business Customer/Contractor");
          System.out.println("0. Back");
    	  int select3 = nextInt("");
    	  
    	  switch(select3)
    	  {
    	  case 1:
    		  
    		  /*
    		   * EDIT CUSTOMER
    		   */
    		  
    		  System.out.println("Pick a customer to edit:");
    		  for(int i = 0; i < customerCount; i++) {
    			  Customer temp = customerData[i];
    			  System.out.println("ID: "+i+" // "+customerData.toString());
    		  }
    		  int cuID = nextInt("");
    		  
    		  System.out.println("Select Field to Edit");
    		  System.out.println("1. First Name");
    		  System.out.println("2. Last Name");
    		  System.out.println("3. Address");
    		  System.out.println("4. Phone Number");
    		  System.out.println("5. Email Address");
    		  int editID = nextInt("");
    		  System.out.println("Enter new data");
    		  
    		  switch(editID) {
    		  
    		  case 1:
    			  customerData[cuID].firstName = nextLine("");
    			  break;
    		  case 2:
    			  customerData[cuID].lastName = nextLine("");
    			  break;
    		  case 3:
    			  customerData[cuID].address = nextLine("");
    			  break;
    		  case 4:
    			  customerData[cuID].phoneNumber = phoneNumber();
    			  
    			  break;
    		  case 5:
    			  customerData[cuID].emailAddress = nextLine("");
    			  break;
    		  
    		  }
    		  
    		  break;
    	  case 2:
    		  
    		  /*
    		   * EDIT CONTRACTOR
    		   */
    		  
    		  System.out.println("Pick a contractor to edit:");
    		  for(int i = 0; i < contractorCount-1000; i++) {
    			  Contractor temp2 = contractorData[i];
    			  System.out.println("ID: "+(i+1000)+" // "+temp2.toString()); //FIX TO STRING
    		  }
    		  int cuID2 = nextInt("");
    		  
    		  System.out.println("Select Field to Edit");
    		  System.out.println("1. First Name");
    		  System.out.println("2. Last Name");
    		  System.out.println("3. Address");
    		  System.out.println("4. Phone Number");
    		  System.out.println("5. Email Address");
    		  System.out.println("6. Contractor Number");
    		  System.out.println("7. Business Name");
    		  
    		  int editID2 = nextInt("");
    		  System.out.println("Enter new data:");
    		  
    		  switch(editID2) {
    		  
    		  case 1:
    			  contractorData[cuID2].firstName = nextLine("");
    			  break;
    		  case 2:
    			  contractorData[cuID2].lastName = nextLine("");
    			  break;
    		  case 3:
    			  contractorData[cuID2].address = nextLine("");
    			  break;
    		  case 4:
    			  contractorData[cuID2].phoneNumber = phoneNumber();
    			  break;
    		  case 5:
    			  contractorData[cuID2].emailAddress = nextLine("");
    			  break;
    		  case 6:
    			  contractorData[cuID2].contractorNumber = nextInt("");
    			  break;
    		  case 7:
    			  contractorData[cuID2].businessName = nextLine("");
    			  break;
    		  
    		  }
    		  
    		  break;
    	  case 0:
    		  break;
    	  }
    	  break;
          
          
      case 3:
    	  
    	    int temp = itemCount - 2000;
    	    
    	    for (int i = 0; i < inventory.length; i++)
    	    {
    	        
    	        String itemName = nextLine("Item Name?");
    	        double weight = nextDouble("Item Weight?");
    	        String description = nextLine("Item Description?");
    	        double salePrice = nextDouble("Sale Price? (e.g. 9.99)");
    	        double pricePaid = nextDouble("Price Paid? (e.g. 9.99)");
    	        int inv = nextInt("How many in inventory?");
    	        //LIST AVAILABLE VENDORS HERE
    	        for(int r = 0; r < (vendorCount - 4000); r++) {
    	        	System.out.println(vendors[r].toString());
    	        }
    	        
    	        int vendorID = nextInt("Vendor ID?");
    	        
    	        inventory[temp] = new Item(itemCount, inv, itemName, weight, description, 
    	        salePrice, pricePaid, vendors[vendorID]);
    	        
    	        itemCount++;
    	
    	    }   
    	  
    	break;
    		  
      case 4:
    	  //EDIT ITEM

		  System.out.println("Pick an item to edit:");
		  for(int i = 0; i < itemCount-2000; i++) {
			  Item temp3 = inventory[i];
			  System.out.println("ID: "+(i+2000)+" // "+temp3.toString()); //FIX TO STRING
		  }
		  int cuID3 = nextInt("");
		  
		  System.out.println("Select Field to Edit");
		  System.out.println("1. Quantity Available");
		  System.out.println("2. Item Name");
		  System.out.println("3. Weight");
		  System.out.println("4. Description");
		  System.out.println("5. Sale Price");
		  System.out.println("6. Price Paid");
		  System.out.println("7. Vendor");
		  
		  int editID3 = nextInt("");
		  System.out.println("Enter new data");
		  
		  switch(editID3) {
		  
		  case 1:
			  inventory[cuID3].count = nextInt("");
			  break;
		  case 2:
			  inventory[cuID3].itemName = nextLine("");
			  break;
		  case 3:
			  inventory[cuID3].weight = nextDouble("");
			  break;
		  case 4:
			  inventory[cuID3].description = nextLine("");
			  break;
		  case 5:
			  inventory[cuID3].setSalePrice(nextDouble(""));
			  input.nextLine();
			  break;
		  case 6:
			  inventory[cuID3].setPricePaid(nextDouble(""));
			  break;
		  case 7:
			  
			  for(int r = 0; r < (vendorCount - 4000); r++) {
  	        	System.out.println("ID: " + (r+4000) + " " + vendors[r].toString());
  	        }
  	        
  	        System.out.print("Vendor ID?");
  	        int vendorID = nextInt("");
  	        
			  break;
		  
		  }
    	  
    	  break;
      case 5:
            int id4 = saleCount - 3000;
            
            
            
            //sales[id4] = new Sale;
    	  /*
    	   * ENTER SALE (AKRAM)
    	   */
    	  
    	  break; 
      case 6:
    	  //System.out.println(describeSale());
    	  /*
    	   * PRINT RECEIPT (AKRAM)
    	   */
    	  
    	  break; 
    	  
      case 7:
    	  
    	int vID = vendorCount - 4000;
    		  
       String vName = nextLine("Vendor Name?");
       String vAddy = nextLine("Vendor Address?");  	  
      long vPhone = phoneNumber();
        
        vendors[vID] = new Vendor(vName, vAddy, vPhone);
        vendorCount++;
    	  break;
    	  
      case 8:
    	  
    	  /*
    	   * EDIT VENDOR
    	   */
    	  
    	  System.out.println("Pick vendor to edit:");
		  for(int z = 0; z < vendorCount-4000; z++) {
			  Vendor temp4 = vendors[z];
			  System.out.println("ID: "+(z+4000)+" // "+temp4.toString()); //FIX TO STRING
		  }
		  int cuID4 = nextInt("");
		  
		  System.out.println("Select Field to Edit");
		  System.out.println("1. Name");
		  System.out.println("2. Address");
		  System.out.println("3. Phone Number");
		  
		  int editID4 = nextInt("");
		  System.out.println("Enter new data");
		  
		  switch(editID4) {
		  
		  case 1:
			  vendors[cuID4-4000].vName = input.nextLine();
			  break;
		  case 2:
			  vendors[cuID4-4000].vAddy = input.nextLine();
			  break;
		  case 3:
			  vendors[cuID4-4000].vPhone = phoneNumber();
			  break;
			  default:
				  System.out.println("Unexpected Input.");
		  break;
		  }
          
      case 9:
    	  System.out.println("Select Report to view:");
		  System.out.println("1. Purchase History (Customer)");
		  System.out.println("2. Purchase History (Item)");
		  System.out.println("3. Current Inventory Levels");
		  
		  int select4 = nextInt("");
		  
		  switch(select4) {
		  
		  case 1:
			  
			  break;
		  case 2:
			  
			        int itemHistCount = 2000;
			        while (itemHistCount <= itemCount)
			            
			            System.out.print(inventory[itemHistCount].itemName + "\t");
			            
			            for (int q = 0; q < sales.length; q++)
			            {
			                if (sales[q].itemSold.itemName.equals(inventory[itemHistCount].itemName))
			                {
			                    System.out.print(sales[q].customer.firstName + " " + sales[q].customer.lastName 
			                    	+ "\t" + 
			                            sales[q].date + "\t" + sales[q].quantity);
			                    
			                    System.out.println();
			                    System.out.print("\t");
			                }
			            }
			   	
			  break;
		  case 3:
			  
			  break;
			  default: System.out.println("Invalid input, try again.");
		  
		  }
    	  
    	  //Purchase History for any given Customer (both types). This should show Items,
            //quantities, total purchase cost, and dates for the Customer. 
    	  /*
    	   * PURCHASE HISTORY FOR CUSTOMER (Akram)
    	   */
    	  
          
          
          
    	  /*
    	   * PURCHASE HISTORY FOR ITEMS (Tyler)
    	   */
    	  
    	  //CURRENT INVENTORY LEVELS ~ Half Psuedo/Half Technical Code (Method to be moved outside main later)
	/*
		public static void Inventory Report() {
			for ( int x = 0; x < itemArray.length; x++)
        		{
          		System.out.print(itemArray[~Location of Name]+": ");
          		System.out.print(itemArray[~Location of Stock]);
                	 }
       			System.out.println();
		}
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

	  public static long phoneNumber() {
	   boolean notValid=true;
	    long phone0 = 0; 
	    while(notValid) {
	    	System.out.println("Phone Number?");
	    	phone0 = input.nextLong();
	    	input.nextLine();
	    if(phone0 >= 1000000000 && phone0 <= 9999999999L) {
		 notValid = false;
	  } else {
		  System.out.println("Invalid input, try again.");
	   
	  }
	    }
	    
	    return phone0;
	    }
	
	public static String nextLine(String display) {
		
		boolean notValid2 = true;
		String output = "";
		
		while(notValid2) {
			System.out.println(display);
			output = input.nextLine();
			if (output.length() > 0) {
				notValid2 = false;
			} else {
				System.out.println("Invalid input, try again.");
			}
		}
		
		return output;
	}
        
	public static int nextInt(String display) {
		boolean notValid3 = true;
		int output2 = 0;
		String stagingArea = "";
		System.out.println(display);
		
		while(notValid3) {
			
			stagingArea = input.nextLine();
			
			try {
				output2 = Integer.parseInt(stagingArea);
				notValid3 = false;
			} catch (Exception e) {
				System.out.println("Invalid input, try again.");
			}
			
		}

		return output2;
	}
	
	public static double nextDouble(String display) {
		boolean notValid4 = true;
		double output3 = 0;
		String stagingArea2 = "";
		System.out.println(display);
		
		while(notValid4) {
			
			stagingArea2 = input.nextLine();
			
			try {
				output3 = Double.parseDouble(stagingArea2);
				notValid4 = false;
			} catch (Exception e) {
				System.out.println("Invalid input, try again.");
			}
			
		}

		return output3;
	}
   
    /*public static void printInventory(Item[] inventory)
    {
    System.out.println("Current Inventory Levels\n" + "---------------------")
    
    for (int i = 0; i < inventory.length; i++)
    {
        inventory[i] 
    
    
    }
    }
    */
    
    /*public static void custPurchaseHistory(Sale[] sales)
    {
    
    for (int i = 0; i < saleCount - 300; i++)
    {
        System.out.println("Customer: " + sales[i].customer + ", " + 
        "Item(s) Sold: " + sales[i].itemSold + ", " + "Quantities: " + 
        sales[i].quantity + ", " + "Total Purchase Cost: " + 
        sales[i].getPricePaid() + ", " + "Date: " + sales[i].date));
    
    }
    System.out.println();
    }
    */
	
	/*
	
    	*/   
}
