package shop;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Fries fries = new Fries("fries",Size.L,2.50, 10);
        Hat hats = new Hat("Hat", Size.S, 5.00, 7);

        Cart cart = new Cart(new ArrayList<>());

        User timothy = new User(cart);
        System.out.println(fries.getInventory());
        System.out.println(fries.getQuantity());

        timothy.addToCart(fries, 3);
        timothy.addToCart(hats, 7);
//        timothy.removeFromCart(fries, 3);
//        System.out.println(cart.getProduct().toString());
//        System.out.println(fries.getInventory());
//        System.out.println(fries.getQuantity());
//        timothy.removeFromCart(hats, 2);
//        timothy.removeFromCart(hats, 1);
        System.out.println(hats.getQuantity());
        System.out.println(cart.cartQty());
        cart.setSpecial(Special.SUN);
        System.out.println(cart.subTotal());
        System.out.println(cart.totalAfterTax());
        cart.checkOut();
        System.out.println("\n");


    }





}
