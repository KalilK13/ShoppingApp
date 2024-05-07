package shop;

public class Soda extends Food implements Perishable{
    private int inventory;

    public Soda(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
}
