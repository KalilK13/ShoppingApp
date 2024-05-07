package shop;

public class User {
    private static int id;
    private int uniqueID;
    private Cart cart;
    public User(Cart cart){
        this.cart = cart;
    }
    public void addToCart(Product product, int qty){
        if(product.getInventory() == 0){
            System.out.println("Item is sold out.");
        }
        else if(qty > product.getInventory()) {
            System.out.println("You are trying to buy too many of this item. There are " + product.getInventory() + " left.");
        }
        else if(qty <= product.getInventory()){
            cart.getProduct().add(product);
            product.setInventory(product.getInventory()-qty);
            product.setQuantity(qty);
        }
    }
    public void removeFromCart(Product product, int amount){
        if(product.getQuantity() == 0){
            System.out.println("You do not have any items to remove.");
        } else if (product.getQuantity() < amount) {
            System.out.println("You do not have that many items in your cart");
        } else if (product.getQuantity() >= amount) {
            product.setQuantity(product.getQuantity()-amount);
            product.setInventory(product.getInventory() + amount);
            if(product.getQuantity() == 0)
                cart.getProduct().remove(product);
        }
    }
}
