public class Que_07 {

    String productName;
    double price;

 
    static int totalProducts = 0;

    // Parameterized constructor
    Que_07(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; 
        
    }

   
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("--------------------");
    }

  
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

   
    public static void main(String[] args) {
     
        
        Que_07 p1 = new Que_07("Laptop", 1200.50);
        Que_07 p2 = new Que_07("Smartphone", 799.99);
        Que_07 p3 = new Que_07("Headphones", 149.99);

        // Display details of each product
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        // Display total products
        Que_07.displayTotalProducts();
    }
}

