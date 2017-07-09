package catalog;

//base class
public class Product {
	private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price  = price;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String setName(String name) {
        return (this.name = name);
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public double setPrice(double price) {
        return (this.price = price);
    }
    
    //method that gives the kind of class of the object instance
    public String getType() {
        return "Product";
    }
}
