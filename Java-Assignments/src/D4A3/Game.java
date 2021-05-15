package D4A3;

public class Game implements IEntity {
private	int id;
private	String name;
private	double price;
private	double discountedPrice;
private double discountRate;
/**
 * @param id
 * @param name
 * @param price
 * @param discount
 */
public Game(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

}
