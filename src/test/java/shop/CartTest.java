package shop;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @org.junit.jupiter.api.Test
    void subTotal() {
        Fries fries = new Fries("fries",Size.L,2.50, 10);
        Hat hats = new Hat("Hat", Size.S, 5.00, 7);
        ArrayList<Product> products = new ArrayList<>();
        products.add(fries);
        products.add(hats);
        Cart cart = new Cart(products);
        cart.setSpecial(Special.MON);
        double expected = fries.getPrice() * fries.getQuantity() + hats.getQuantity() * hats.getPrice();
        double actual = cart.subTotal();
    }
}