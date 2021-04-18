package pgo.repository;

import java.util.ArrayList;

public class Category {
    private String category;
    private ArrayList<Product> product = new ArrayList<>();

    public Category(String category, ArrayList<Product> product) {
        this.category = category;
        this.product = product;
    }

    public Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProductBag(ArrayList<Product> product) {
        this.product = product;
    }

    public void addProduct(Product p) {
        product.add(p);
    }

    public void deleteProductByIndex(int i) {
        product.remove(i);
    }

}
