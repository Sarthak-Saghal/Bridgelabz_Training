import java.util.Scanner;

public class Que_04 {

    String title;
    String author;
    double price;

    void setDetails(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayDetails() {
        System.out.println("\nBook Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        Que_04 obj1 = new Que_04();

  
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();

        
        obj1.setDetails(title, author, price);
        obj1.displayDetails();

    }


}
