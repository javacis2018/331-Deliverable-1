import java.util.Scanner;
/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
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
                customerData[0] = new Customer(0, "Bob", "McDaniels", "6969 Glenbarr Ave", 5712128900L, "BobM@yahoo.com");
                customerCount++;
                customerData[1] = new Customer(1, "Jacob", "Thomas", "55 Main St", 2388330048L, "JakeThomas@aol.com");
                customerCount++;
                customerData[2] = new Customer(2, "Rachel", "Peterson", "420 Cool St", 5714712993L, "RachP@aol.com");
                customerCount++;
                customerData[3] = new Customer(3, "Tyler", "Joseph","1 Infinite Loop", 3010229384L, "TylerJoseph@hotmail.com");
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
                inventory[0] = new Item(1000, "Screws", 1.0, "Long neck Screws", 
                5.0, 10.0, vendors[0]);
                itemCount++;
                inventory[1] = new Item(300, "Hammers", 13.0, "Iron Hammers", 
                30.0, 10.0, vendors[1]);
                itemCount++;
                inventory[2] = new Item(50, "Laptops", 20.0, "Sony Laptop", 
                300.0, 10.0, vendors[2]);
                itemCount++;
                inventory[3] = new Item(120, "Drywall", 1.0, "liquid for drywall", 
                15.0, 10.0, vendors[0]);
                itemCount++;
                inventory[4] = new Item(115, "Cement", 13.0, "chalk for creating cement", 
                20.0, 10.0, vendors[0]);
                itemCount++;
                inventory[5] = new Item(500, "Short Screws", 1.0, "Short neck Screws", 
                5.0, 10.0, vendors[1]);
                itemCount++;
                inventory[6] = new Item(20, "Nails", .5, "Long neck Nails", 
                3.0, 10.0, vendors[0]);
                itemCount++;
                inventory[7] = new Item(10, "TV", 40.0, "Sony TV", 
                450.0, 10.0, vendors[2]);
                itemCount++;
                inventory[8] = new Item(75, "MousePad", 1.0, "Sony Mousepad", 
                10.0, 10.0, vendors[2]);
                itemCount++;
                inventory[9] = new Item(400, "2x4 wood block", 13.0, "2x4 plywood blocks", 
                7.0, 10.0, vendors[1]);
                itemCount++;
                
                contractorData[0] = new Contractor("Steven", "Strange", 9874441295L, "sstrangemd@fastmail.com", 1,"Stranger Things", "2 Infinite Loop");
                contractorCount++;
                
                int itemC0[] = {2000,2009};
                int itemQ0[] = {20, 5};
                int itemC1[] = {2008, 2006, 2003};
                int itemQ1[] = {1, 4, 12};
                int itemC2[] = {2003,2005};
                int itemQ2[] = {20, 80};
                int itemC3[] = {2007};
                int itemQ3[] = {1};
                int itemC4[] = {2008};
                int itemQ4[] = {3};
                
             sales[0] = new Sale(itemC0, itemQ0, 2, "December 12, 1996", 135.00, customerData[3]);
             saleCount++;
             sales[1] = new Sale(itemC1, itemQ1, 3, "September 12, 2014", 224.00, customerData[0]); //Bob
             saleCount++;   
             sales[2] = new Sale(itemC2, itemQ2, 2, "October 12, 2005", 700.00, customerData[2]);
             saleCount++; 
             sales[3] = new Sale(itemC3, itemQ3, 1, "January 12, 2018", 450.00, customerData[1]);
             saleCount++;   
             sales[4] = new Sale(itemC4, itemQ4, 1, "April 12, 2000", 30.00, customerData[3]);
             saleCount++;   
    		 
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
    		  
    		  customerData[id] = new Customer(customerCount, firstName, lastName, address,
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
    		  listCustomers(customerCount, customerData);
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
    		  
listContractors(contractorCount, contractorData);
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
    		  cuID2 -= 1000;
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
    	        
    	        inventory[temp] = new Item( inv, itemName, weight, description, 
    	        salePrice, pricePaid, vendors[vendorID]);
    	        
    	        itemCount++;
    	
    	    }   
    	  
    	break;
    		  
      case 4:
    	  //EDIT ITEM

listItems(itemCount, inventory);
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
			  inventory[cuID3-2000].count = nextInt("");
			  break;
		  case 2:
			  inventory[cuID3-2000].itemName = nextLine("");
			  break;
		  case 3:
			  inventory[cuID3-2000].weight = nextDouble("");
			  break;
		  case 4:
			  inventory[cuID3-2000].description = nextLine("");
			  break;
		  case 5:
			  inventory[cuID3-2000].setSalePrice(nextDouble(""));
			  input.nextLine();
			  break;
		  case 6:
			  inventory[cuID3-2000].setPricePaid(nextDouble(""));
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
            
            //int[][] staging = new int[2][1000];
            
            listCustomers(customerCount, customerData);
            int cust = nextInt("Choose current customer:");
            
            int unique = nextInt("How many UNIQUE items are being purchased?");
            
            listItems(itemCount, inventory);
            int[] itemCache = new int[1000];
            int[] itemQty = new int[1000];
            
            for (int t = 0; t < unique; t++) { //THESE ARE SCALED DOWN
            	itemCache[t] = (nextInt("Select item:") + 2000);
            	int temp9 = itemCache[t];
            	int limit = inventory[temp9].count;
            	
            	boolean isValid4 = true;
            	
            	while(isValid4) {
            		itemQty[t] = nextInt("Quantity?");
            		if (itemQty[t] <= limit) {
            			
            			inventory[temp9].decrementCount(itemQty[t]);
            			
            			isValid4 = false;
            		} else {
            			System.out.println("Insufficient stock, try again.");
            		}
            	}
            }
            	String date = nextLine("Transaction Date?");
            	
            	double total = 0;
            	
            	for(int y = 0; y < unique; y++) {
            		total += (inventory[itemCache[y]].getSalePrice() * itemQty[y]);      	
            			}
            
            sales[id4] = new Sale(itemCache, itemQty, unique, date, total, customerData[cust]);
            
            		saleCount++;
            
           /*
            * list customers
            * how many unique items are being purchased?
            * list items
            * quantity of each item
            * check quantity
            * date
            * calculate price
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
    	  
    	 listVendors(vendorCount, vendors);
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
			  
			  //List purchases by Customer
			  
			  int select5 = nextInt("1. Customer\n2. Contractor");
			  
			  switch(select5) {
			  case 1:
			  listCustomers(customerCount, customerData);
        		  System.out.println("Display data for which customer?");
        
        		  int customerChoice = input.nextInt();
        		  //input.nextLine();
        		  
        		  String[] items = new String[1000];
        		  for (int g = 0; g < 1000; g++) {
        			  items[g] = "";
        		  }
        		  int[] quant = new int[1000];
        		  double[] total2 = new double[1000];
        		  String[] date2 = new String[1000];
        		  
        		  int flag2 = 0;
        		  
        //have customerID
        		  for (int q = 0; q < saleCount - 3000; q++) {
    				  Sale currentSale = sales[q];
    				  
    				  if (customerData[customerChoice].toString().equals(sales[q].customer.toString())) {
    					  date2[flag2] = currentSale.date;
    					  total2[flag2] = currentSale.total;
    					  
    					  for(int t = 0; t < currentSale.unique; t++) {
    						  //NULL POINTER BELOW
    						  items[flag2].concat("\nID: "+currentSale.itemCache[t]+" // QTY: " +currentSale.itemQty[t]);
    						  
    					  }
    					  flag2++;
    					  
    				  } //if

    			  } //for q
        		  System.out.println(customerData[customerChoice].firstName +" "+customerData[customerChoice].lastName);
        		  for (int g = 0; g < flag2; g++) {
        			  System.out.println(date2[g]);
        			  System.out.println("$"+total2[g]);
        			  System.out.print(items[g]);
        		  }
        		  System.out.println("End.");
        		  break;
        		  /*System.out.println("Purchase Report For " + customerData[customerChoice].firstName);
			  System.out.println("Item\tQuantity\tDate");
			  for (int i = 0; i < sales.length; i++)
			  {
          		  	if (sales[i].customer == sales[customerChoice+1].customer)
			  	{
                		System.out.println(sales[i].itemName + "\t" +
                                            sales[i].quantity + "\t" +
                                                sales[i].date);
           		  	}
            
        		  }
        		  */

        		  case 2:
        			  
        			  listContractors(contractorCount, contractorData);
        			  int contractorChoice = nextInt("Which Contractor?");

        			  default:
        				  System.out.println("Unexpected Input.");
			  break;
			  }
      
      	  
			  
		  case 2:
			  
			  //PURCHASE HISTORY (ITEM)
			  
			  listItems(itemCount, inventory);
			  
			  String[] dates = new String[1000];
			  String[] who = new String[1000];
			  int[] much = new int[1000];
			  
			  int flag = 0;
			  
			  int select6 = nextInt("Select an item ID.");
			  
			  for (int q = 0; q < saleCount - 3000; q++) {
				  Sale currentSale = sales[q];
				  for (int w = 0; w < currentSale.unique; w++) {
					
					  if(select6 == currentSale.itemCache[w]) {
						  
						  dates[flag] = currentSale.date;
						  
						  who[flag] = currentSale.customer.firstName + " " + currentSale.customer.lastName;
						  
						  much[flag] = currentSale.itemQty[w];
						  
						  flag++;
					  } //if
					  
				  } //for w

			  } //for q
			  
			  for (int u = 0; u < flag; u++) {
				  System.out.println(dates[u] + " // " + who[u] + " // QTY: " + much[u]);
			  }
			  
			  System.out.println("Report complete.");
			  
			  break;
		  case 3:
			  
			  System.out.println("Item Name\tQuantity");
                          for(int i = 0; i<itemCount-2000;i++)
                              System.out.println(inventory[i].itemName+"\t"+inventory[i].count);
                              
			  break;
			  
			  default: System.out.println("Invalid input, try again.");
		  
		  }
    	  
    	  break;
    	  
      case 0:
    	  System.exit(0);
    	  break;
      default:
    	  System.out.println("Error. Unrecognized input.");
      }
		}
    }

	  public static void listCustomers(int customerCount, Customer[] customerData) {
	  System.out.println("Pick a customer:");
	  for(int i = 0; i < customerCount; i++) {
		  Customer temp = customerData[i];
		  System.out.println("ID: "+i+" // "+temp.toString());
	  }
	  }
	  
	  public static void listContractors(int contractorCount, Contractor[] contractorData) {
		  System.out.println("Pick a contractor:");
		  for(int i = 0; i < contractorCount-1000; i++) {
			  Contractor temp2 = contractorData[i];
			  System.out.println("ID: "+(i+1000)+" // "+temp2.toString());
		  }
	  }
	  
	  public static void listItems(int itemCount, Item[] inventory) {
		  System.out.println("Pick an item:");
		  for(int i = 0; i < itemCount-2000; i++) {
			  Item temp3 = inventory[i];
			  System.out.println("ID: "+(i+2000)+" // "+temp3.toString());
		  }
	  }
	  
	  public static void listVendors(int vendorCount, Vendor[] vendors) {
		  System.out.println("Pick vendor to edit:");
		  for(int z = 0; z < vendorCount-4000; z++) {
			  Vendor temp4 = vendors[z];
			  System.out.println("ID: "+(z+4000)+" // "+temp4.toString());
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
			
			try { //NEEDS NEGATIVE PROTECTION
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
        sales[i].itemQty + ", " + "Total Purchase Cost: " + 
        sales[i].getPricePaid() + ", " + "Date: " + sales[i].date));
    
    }
    System.out.println();
    }
    */
	
	/*
	
    	*/   
}
