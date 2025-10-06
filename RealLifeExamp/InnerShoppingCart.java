package RealLifeExamp;

/*Imagine you’re building a shopping system where users can place orders 
differently — by item name, by item name + quantity, or by item name + quantity + discount. */
class ShoppingCart {

    void placeOrder(String item) {
        System.out.println("Order 1 unit of "+ item);
    }

    void placeOrder(String item, int quantity) {
        System.out.println("order "+ quantity+ " units of "+ item);
    }

    void placeOrder(String item,int quantity, double discount){
        System.out.println("Order "+ quantity+ " units of "+ item+ "with "+ discount + "% discount ");
    }
    
}

public class InnerShoppingCart {

    public static void main(String[] args) {
        ShoppingCart AddToCart = new ShoppingCart();
        AddToCart.placeOrder("Bike ");
        AddToCart.placeOrder("Private jet ", 12);
        AddToCart.placeOrder("Laptop ", 3, 27);
    }

    
}
