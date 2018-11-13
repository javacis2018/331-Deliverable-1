
/*
 * @author Christopher Kang
 * @version 11 November 2018
 * Modified for the Group Project
*/

public class Sale {
    public static Item itemSold;
    public int quantity;
    public String date;
    public String customer;
    
    public Sale(Item itemSold, int quantity, String date, String customer){
        
        this.itemSold = itemSold;
        this.quantity = quantity;
        this.date = date;
        this.customer = customer ;
        
    }
    public String describeSale(){
        System.out.printf("Item Sold:" + this.itemSold.itemName + ", " + "Price: $" + this.itemSold.getPrice() + ", " +  "Quanitity:" + 
                quantity + ", " + "Sale Total:" + (itemSold.getPrice() * quantity));
        
        return ("");
    }
    
}
