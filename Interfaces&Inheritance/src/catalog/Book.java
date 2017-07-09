package catalog;

/**
 * 
 * Super class: Product
 * Subclass: Book
 *
 */
public class Book extends Product {
	private String author;
    private int pages;
    
    public Book(String name, double price, String author, int pages) {
    	//constructor for parent/super class
        super (name, price); //properties from super class Product
        this.author = author;
        this.pages = pages;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String setAuthor(String author) {
        return (this.author = author);
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
