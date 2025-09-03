public class Que_05 {

    String brand;
    String model;
    double price;


    Que_05(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("-----------------------------");
    }



    public static void main(String[] args) {
      
        Que_05 obj1 = new Que_05("Samsung", "Galaxy S21", 69999);
        Que_05 obj2 = new Que_05("Apple", "iPhone 14", 79999);

        
        obj1.displayDetails();
        obj2.displayDetails();
    }


}
