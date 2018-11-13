/*
 * @author Akram Choukri
 * @version 11 November 2018
 * Modified for the Group Project
*/

public class Sale {
    public static Item itemSold;
    public int quantity;
    public String date;
    public Customer customer;
    private double price;
    
    
    public Sale(Item itemSold, int quantity, String date, Customer customer){
        
        this.itemSold = itemSold;
        this.quantity = quantity;
        this.date = date;
        this.customer = customer ;
        
    }
    public String describeSale(){
        System.out.printf("Item Sold:" + this.itemSold.itemName + ", " + "Price: $" + this.itemSold.getSalePrice() + ", " +  "Quanitity:" + 
                quantity + ", " + "Sale Total:" + (itemSold.getSalePrice() * quantity));
        
        return ("");
    }
    
    
    
}
