package catalog;

import java.util.ArrayList;

public class RunCatalog {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        
        products.add(new Book("Don Quixote", 49.99, "Miguel de Cervantes", 600));
        products.add(new CD("Billie Jean", 19.99, "MJ", 5));
        products.add(new Product("Paper", 0.99));
        
        System.out.printf("%-10s\t%10s\t%-10s\n", "NAME", "PRICE", "TYPE");
        for (Product p : products) {
            System.out.printf("%-10s\t%8.2f\t%-10s\n", p.getName(), p.getPrice(), p.getType());
        }
    }
    
}