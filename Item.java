/*
 * @author Christopher Kang
 * @version 11 November 2018
 * Modified for the Group Project
 */
public class Item {
	
String itemName;
double weight;
String description;
private double salePrice;
private double pricePaid;

public Item (String itemName, double weight, String description, double salePrice, double pricePaid) {
	
	this.itemName = itemName;
	this.weight = weight;
	this.description = description;
	this.salePrice = salePrice;
	this.pricePaid = pricePaid;
	
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
}
