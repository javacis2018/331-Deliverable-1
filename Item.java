/**
 * CIS 331 Group Project
 * 
 * @author Tyler Davis
 * @author Christopher Kang
 * @author Jeremy Snyder
 * @author Akram Choukri
 * 
 * Item - This class defines Items that the system can sell to Customers.
 */
public class Item {
	
//int id;
int count;
String itemName;
double weight;
String description;
private double salePrice;
private double pricePaid;
Vendor vendor;

public Item (int count, String itemName, double weight, String description, double salePrice, double pricePaid, Vendor vendor) {
	
	//this.id = id;
	this.count = count;
	this.itemName = itemName;
	this.weight = weight;
	this.description = description;
	this.salePrice = salePrice;
	this.pricePaid = pricePaid;
	this.vendor = vendor;
	
}

public double getSalePrice() {
return salePrice;	
}

public void setSalePrice(double salePrice) {
	this.salePrice = salePrice;
}

public double getPricePaid() {
	return pricePaid;
}

public void setPricePaid(double pricePaid) {
	this.pricePaid = pricePaid;
}

public void decrementCount() {
	count--;
}

public void incrementCount() {
	count++;
}
    public String toString()
    {
        return itemName + " // " + description + " // QTY: " + count + " // WGT: " + weight + " $" + salePrice + " // V: " + vendor.vName;
    }
}
