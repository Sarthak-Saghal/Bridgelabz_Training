public class Que_03 {


   
    String title;
    String author;
    double price;

    Que_03(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("--------------------------------");
    }


    public static void main(String[] args) {
        
        Que_03 obj1 = new Que_03 ("Math Book", "Ravi Kumar", 399.50);
        Que_03 obj2 = new  Que_03("English Book", "Neha Sharma", 650.00);

        obj1.displayDetails();
        obj2.displayDetails();
    }


}
