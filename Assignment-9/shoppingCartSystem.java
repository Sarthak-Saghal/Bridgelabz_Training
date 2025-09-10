
// ShoppingCart.java
 class ShoppingCart {

    static double discount = 10.0;    
    private static int totalProducts = 0;

    private String productName;
    private double price;
    private int quantity;

    private final int productId;

    public ShoppingCart(String productName, double price, int quantity, int productId) {
        this.productId = productId;       
        this.productName = productName;   
        this.price = price;
        this.quantity = quantity;
        totalProducts++;
    }

    public void displayProductDetails() {
        if (this instanceof ShoppingCart) {  
            System.out.println("Product ID   : " + productId);
            System.out.println("Product Name : " + productName);
            System.out.println("Price        : $" + price);
            System.out.println("Quantity     : " + quantity);
            System.out.println("Discount     : " + discount + "%");
            System.out.println("Price After Discount: $" + discountPrice());
            System.out.println("-----------------------------");
        }
    }

    public double discountPrice() {
        double discountedPrice = price - (price * discount / 100);
        return discountedPrice;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Updated Discount: " + discount + "%");
        System.out.println("-----------------------------");
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
        System.out.println("-----------------------------");
    }
}


public class shoppingCartSystem {
    public static void main(String[] args) {

        ShoppingCart p1 = new ShoppingCart("Laptop", 800.0, 2, 101);
        ShoppingCart p2 = new ShoppingCart("Headphones", 150.0, 3, 102);

        p1.displayProductDetails();
        p2.displayProductDetails();

        ShoppingCart.updateDiscount(15.0);

        p1.displayProductDetails();
        p2.displayProductDetails();

        ShoppingCart.displayTotalProducts();
    }
}

