package shop;

public class Fries extends Food implements Perishable{
    private int inventory;

    public Fries(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
}
