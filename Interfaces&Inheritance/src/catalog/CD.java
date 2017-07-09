package catalog;

/**
 * 
 * Super class: Product
 * Subclass: CD
 *
 */
public class CD extends Product {
	private int artist;
    private int length;
    
    public CD(String name, double price, int artist, int length) {
        super (name, price); //properties from super class Product
        this.artist = artist;
        this.length = length;
    }
    
    public int getArtist() {
        return this.artist;
    }
    
    public int setArtist( int artist) {
        return (this.artist = artist);
    }
    
    public int getLength() {
        return this.length;
    }
    
    public int setLength(int length) {
        return (this.length = length);
    }
       
    @Override
  //since this Product is of type CD
    public String getType() {
        return "CD";
    }
}
