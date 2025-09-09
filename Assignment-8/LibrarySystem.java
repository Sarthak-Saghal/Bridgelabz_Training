// Base class
class Book {
    public String ISBN;          // Public: accessible anywhere
    protected String title;      // Protected: accessible in subclass and package
    private String author;       // Private: accessible only within this class

    // Constructor
    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBook() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("----------------------");
    }
}

// Subclass
class EBook extends Book {
    double fileSize; 

    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    void displayEBook() {

        System.out.println("ISBN: " + ISBN);       // public
        System.out.println("Title: " + title);     // protected
        System.out.println("Author: " + getAuthor()); // private via getter
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("----------------------");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create regular book
        Book b1 = new Book("978-0135166307", "Java Programming", "James Gosling");
        b1.displayBook();

        // Modify author using setter
        b1.setAuthor("J. Gosling");
        System.out.println("After updating author:");
        b1.displayBook();

        // Create an ebook
        EBook eb = new EBook("978-1492056270", "Effective Java", "Joshua Bloch", 5.5);
        eb.displayEBook();
    }
}
