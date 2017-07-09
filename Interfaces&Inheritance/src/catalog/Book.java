package catalog;

/**
 * 
 * Super class: Product
 * Subclass: Book
 *
 */
public class Book extends Product {
	private String serial;
    private int pages;
    
    public Book(String name, double price, String serial, int pages) {
        super (name, price); //properties from super class Product
        this.serial = serial;
        this.pages = pages;
    }
    
    public String getSerial() {
        return this.serial;
    }
    
    public String setserial(String serial) {
        return (this.serial = serial);
    }
    
    public int getPages() {
        return this.pages;
    }
    
    public int setPages(int pages) {
        return (this.pages = pages);
    }
                 
    @Override
    //since this Product is of type Book
    public String getType() {
        return "Book";
    }
}
