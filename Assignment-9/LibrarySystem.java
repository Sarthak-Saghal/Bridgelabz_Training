
class Book {

    static String libraryName = "GLA Library";

    private final String Id;

    private String title;
    private String author;

 
    public Book(String title, String author, String Id) {
        this.title = title;  
        this.author = author; 
        this.Id = Id;     
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("-----------------------------");
    }

    public void displayDetails() {
        
        if (this instanceof Book) {
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN  : " + Id);
            System.out.println("Library: " + libraryName);
            System.out.println("-----------------------------");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
  
        Book.displayLibraryName();

        Book b1 = new Book("Java Programming", "Sarthak Sahgal", "ISBN101");
        Book b2 = new Book("Machine Learning", "Sarthak Sahgal", "ISBN102");

        b1.displayDetails();
        b2.displayDetails();
    }
}

