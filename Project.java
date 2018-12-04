import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList; // Drives ComboBox and ListView data
import javafx.event.*; // Dr. E. change
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*; // Dr. E. Change
import javafx.scene.layout.*; // Dr. E. Change
import javafx.stage.Stage;
/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
 * 
 * Project - This file stores most of the core logic for this application.
 */

public class Project extends Application {

	static int customerCount = 0;
	static int contractorCount = 1000;
	static int itemCount = 2000;
	static int saleCount = 3000;
	static int vendorCount = 4000;
	
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
	
	static Customer[] customerData = new Customer[1000];
	static Contractor[] contractorData = new Contractor[1000];
	static Item[] inventory = new Item[1000]; 
	static Sale[] sales = new Sale[1000]; 
	static Vendor[] vendors = new Vendor[1000];
	
	/*
	 * MISSING SAMPLE DATA METHODS
	 */
	
	GridPane pane = new GridPane();
	TextField field = new TextField("test");
	Label prompt = new Label("test label");
	CheckBox chkIncludeY = new CheckBox("test check");
	
	//RadioButtons
	ToggleGroup buttons =  new ToggleGroup();
	TextField out = new TextField();
	
	Button createCustomer = new Button("Create Customer");
			Button editCustomer = new Button("Edit Customer");
			Button createItem = new Button("Create Inventory Item");
			Button editItem = new Button("Edit Inventory Item");
			Button enterSale = new Button("Enter Sale");
			Button print = new Button("Print Receipt");
			Button createVendor = new Button("Create Vendor");
			Button editVendor = new Button("Edit Vendor");
			Button reports = new Button("Reports");
			//Button quit = new Button("Exit");
	int testing = 20;
	
			
	@Override
	public void start(Stage showtime) {
		//Create initial menu pane
		pane.add(createCustomer, 0, 1);
		createCustomer.setOnAction(e -> mainMenu(1));
		pane.add(editCustomer, 0, 2);
		editCustomer.setOnAction(e -> mainMenu(2));
		pane.add(createItem, 0, 3);
		createItem.setOnAction(e -> mainMenu(3));
		pane.add(editItem, 0, 4);
		editItem.setOnAction(e -> mainMenu(4));
		pane.add(enterSale, 0, 5);
		enterSale.setOnAction(e -> mainMenu(5));
		pane.add(print, 0, 6);
		print.setOnAction(e -> mainMenu(6));
		pane.add(createVendor, 0, 7);
		createVendor.setOnAction(e -> mainMenu(7));
		pane.add(editVendor, 0, 8);
		editVendor.setOnAction(e -> mainMenu(8));
		pane.add(reports, 0, 9);
		reports.setOnAction(e -> mainMenu(9));
		
		//pane.add(quit, 0, 10);
		pane.setAlignment(Pos.CENTER);
		
		
		Scene causeScene = new Scene(pane, 320, 480);
		showtime.setTitle("Valley Depot IS 0.2");
		showtime.setScene(causeScene);
		showtime.show();
				
	}
	
	public static void mainMenu(int input) {
		switch(input) 
	      {
	      
	      case 1:
	    	  
	    	  
	          System.out.println("1. Create Individual Customer");
	          System.out.println("2. Create Business Customer/Contractor");
	          System.out.println("0. Back");
	    	  int select2 = nextInt("");
	    	  
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
	
	public static void main(String[] args) {

		launch(args);
    }
/*
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
	*/
 
}
