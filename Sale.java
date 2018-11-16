/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
 * @author Jeremy Snyder
 * @author Akram Choukri
 * 
 * Sale - This class defines individual Sales.
 */

public class Sale {
    public int[][] saleData;
    public String date;
    public Customer customer;
    private double price;
    public int saleID;
    public int customerID;
    
    
    public Sale(int[][] saleData, String date, Customer customer, double price){
        
    	for(int i=0; i<saleData.length; i++) //1st var is item, 2nd var is qty
    		  for(int j=0; j<saleData[i].length; j++)
    		    saleData[i][j]=this.saleData[i][j];
    	
        this.date = date;
        this.customer = customer ;
        this.price = price;
    }
   // public String describeSale(){
     //   System.out.printf("Item Sold:" + this.itemSold.itemName + ", " + "Price: $" + this.itemSold.getSalePrice() + ", " +  "Quanitity:" + 
       //         this.quantity + ", " + "Sale Total:" + (this.itemSold.getPricePaid()));
        
        //return ("");
    //}
    public String toString(){
        String salesString = new String("");
        salesString += //item + " " + saleID + " " + quantity + " " + date + " " + custID + " " + price;
        return saleString;
    }
    
}
