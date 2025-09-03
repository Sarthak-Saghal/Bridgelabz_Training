public class Que_02 {

    double radius;

   
    Que_02(double radius) {
        this.radius = radius;
    }

   
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
        System.out.println("----------------------------------");
        System.out.println("");
    }



    public static void main(String[] args) {
        
        Que_02 obj1 = new Que_02(5.0);
        Que_02 obj2 = new Que_02(7.5);

      
        obj1.displayDetails();
        obj2.displayDetails();
    }
}


