package shop;

public class Hat extends Clothing{
    private int inventory;

    public Hat(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
}
