public class Que_05 {

    

    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Constructor
    public Que_05(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (availability) {
            availability = false; 
            System.out.println("You have successfully borrowed \"" + title + "\" by " + author);
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
        }
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Que_05  book1 = new Que_05 ("mathsBook", "sarthak", 1299, true);
        Que_05  book2 = new Que_05("1984", "Louis", 1550, false);

        book1.displayBook();
        book1.borrowBook();   // Should allow borrowing
        book1.borrowBook();   // Now unavailable

        book2.displayBook();
        book2.borrowBook();   // Not available
    }
}
