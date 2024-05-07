package shop;

public abstract class Product {
    private static int id;
    private String name;
    private Size size;
    private double price;
    private Integer qty;
    private int inventory;
    private int quantity;

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, Size size, double price, int inventory){
        this.name = name;
        this.size = size;
        this.price = price;
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return quantity + " " +size+ " " + name;
    }
}
