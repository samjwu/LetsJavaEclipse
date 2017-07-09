package catalog;

import java.util.ArrayList;

public class RunCatalog {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        
        products.add(new Book("Don Quixote", 49.99, "Miguel de Cervantes", 600));
        products.add(new CD("Billie Jean", 19.99, "MJ", 5));
        products.add(new Product("Paper", 0.99));
        
        System.out.printf("%s %20s %20s \n", "NAME", "PRICE", "TYPE");
        for (Product p : products) {
            System.out.printf("%11s %13.2f %20s \n", p.getName(), p.getPrice(), p.getType());
        }
    }
    
}