package shop;

public class Shirt extends Clothing{
    private int inventory;

    public Shirt(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
}
