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
	public int[] itemCache;
	public int[] itemQty;
    public String date;
    public Customer customer;
    
    
    public Sale(int[] itemCache, int[] itemQty, String date, Customer customer){
        
    	/*for(int i=0; i<saleData.length; i++) //1st var is item, 2nd var is qty
    		  for(int j=0; j<saleData[i].length; j++)
    		    saleData[i][j]=this.saleData[i][j];
    	*/
    	for(int i = 0; i < itemCache.length; i++) {
    		this.itemCache[i] = itemCache[i];
    	}
    	for(int e = 0; e < itemQty.length; e++) {
    		this.itemCache[e] = itemCache[e];
    	}
    	
        this.date = date;
        this.customer = customer ;
        
    }
   // public String describeSale(){
     //   System.out.printf("Item Sold:" + this.itemSold.itemName + ", " + "Price: $" + this.itemSold.getSalePrice() + ", " +  "Quanitity:" + 
       //         this.quantity + ", " + "Sale Total:" + (this.itemSold.getPricePaid()));
        
        //return ("");
    //}
    public String toString() {
    	return "test"; 
    }
    
}
