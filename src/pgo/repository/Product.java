package pgo.repository;

public class Product {
    private String name;
    private double price;
    private String materialCode;
    private int quantity = 0;

    public Product(String name, double price, String materialCode) {
        this.name = name;
        this.price = price;
        this.materialCode = materialCode;
    }

    public Product(String name, double price, String materialCode, int quantity) {
        this.name = name;
        this.price = price;
        this.materialCode = materialCode;
        this.quantity = quantity;
    }

    public String getAll() {
        return "name: " + name + "\nprice: " + price + "\nmaterialCode: " + materialCode + "\nquantity: " + quantity;
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

    public String getMaterialCode() {
        return materialCode;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Liczba sztuk produktu musi być większa od 0");
        } else {
            this.quantity = quantity;
        }
    }
}
