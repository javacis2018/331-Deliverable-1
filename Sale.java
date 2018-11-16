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
    public static Item itemSold;
    public int quantity;
    public String date;
    public Customer customer;
    private double price;
    public int saleID;
    public int customerID;
    
    
    public Sale(Item itemSold, int quantity, String date, Customer customer, double price, int ID){
        
        this.itemSold = itemSold;
        this.quantity = quantity;
        this.date = date;
        this.customer = customer ;
        this.price = price;
        this.saleID = ID;
    }
    public String describeSale(){
        System.out.printf("Item Sold:" + this.itemSold.itemName + ", " + "Price: $" + this.itemSold.getSalePrice() + ", " +  "Quanitity:" + 
                this.quantity + ", " + "Sale Total:" + (this.itemSold.getPricePaid()));
        
        return ("");
    }
    public String toString() {
    	return itemSold + " x " + quantity + " @ " + price + " // " + customer + " " + date; 
    }
    
}
