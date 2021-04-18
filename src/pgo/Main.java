package pgo;

import pgo.repository.Category;
import pgo.repository.Product;
import pgo.repository.User;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        User u1 = new User("mat@pj.pl");
        User u2 = new User("pie@pj.pl");
        User u3 = new User("Mateusz", "Rybak", u1.getEmail(), "passw0rd", false);

        Product p1 = new Product("produkt1", 1.5, "SK-SKU123");
        Product p2 = new Product("produkt2", 3, "SK-SKU456", 10);
        Product p3 = new Product("produkt3", 8, "SY-SKU256", 15);
        p1.setPrice(2);
        p2.setQuantity(5);

        //1 konstruktor
        ArrayList<Product> product = new ArrayList<>();
        Category cat1 = new Category("tele", product);
        cat1.addProduct(p1);
        cat1.addProduct(p2);
        cat1.addProduct(p3);
        cat1.addProduct(p1);

        cat1.setCategory("mobile");
        cat1.addProduct(p3);
        cat1.deleteProductByIndex(0);

        //2 konstruktor
        ArrayList<Product> product2 = new ArrayList<>();
        Category cat2 = new Category("Auto");
        cat2.setProductBag(product2);
        cat2.addProduct(p1);
        cat2.addProduct(p2);
        cat2.addProduct(p3);
        cat2.deleteProductByIndex(0);

        //pokaz kategorie
        for (int i = 0; i < cat1.getProduct().size(); i++) {
            System.out.println("\nKategoria " + cat1.getCategory() + "\tPozycja " + i + ":\n" + cat1.getProduct().get(i).getAll());
        }


    }
}
