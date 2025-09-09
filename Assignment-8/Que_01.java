public class Que_01{

    String title;
    String author;
    double price;

    // Default constructor
    Que_01() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    Que_01(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }


    public static void main(String[] args) {
        // Using default constructor
        Que_01 b1 = new Que_01();
        System.out.println("Book 1 Details:");
        b1.display();

        System.out.println();

        // Using parameterized constructor
        Que_01 b2 = new Que_01("Java Programming", "James Gosling", 599.99);
        System.out.println("Book 2 Details:");
        b2.display();
    }
}

