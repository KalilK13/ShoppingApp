package shop;

import java.util.ArrayList;

import static shop.Special.SUN;
import static shop.Special.TUE;

public class Cart {
    private ArrayList<Product> product;
    private final float TAX = 10.0f;
    private Special special;
    public Cart(ArrayList<Product> product){
        this.product = product;
//        setProduct(new ArrayList<>());
    }

    public Special getSpecial() {
        return special;
    }

    public void setSpecial(Special special) {
        this.special = special;
    }

    public Integer cartQty(){
        int count = 0;
        for(Product p: product){
            count += p.getQuantity();
        }
        return count;
    }
    public double subTotal(){
        double totals = 0.0;
        if(getSpecial().equals(SUN) || getSpecial().equals(TUE)){
            for(Product g: product){
                if (g.getQuantity() == 1){
                    totals += g.getQuantity() * g.getPrice();
                }
                else if(g.getQuantity()%2 == 0) {
                    totals += ((float)g.getQuantity() * g.getPrice())/2;
                }
                else if(g.getQuantity()%2 != 0){
//                    totals +=(((float)g.getQuantity()/2) * g.getPrice());
                    totals += Math.ceil((float)g.getQuantity()/2) * g.getPrice();
                }
            }
            return totals;
        }

        for(Product p: product){
            totals += p.getQuantity() * p.getPrice();
        }

        return totals;
    }
    public double totalAfterTax(){
        return subTotal() + (subTotal() * (TAX/100)) ;
    }
    public void checkOut(){
        System.out.printf("You have %d items, and your total is %c%.2f and %c%.2f after tax.\nHave a nice day!\n",cartQty(),'$',subTotal(),'$',totalAfterTax());
        if(getSpecial().equals(SUN) || getSpecial().equals(TUE)){
            Special.checkSaleDay(getSpecial());
        }
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }
}
