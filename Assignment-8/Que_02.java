public class Que_02 {

    double radius;

    // Default constructor
    
    Que_02() {
        this(1.0);  
        
    }

    // Parameterized constructor
    Que_02(double radius) {
        this.radius = radius;
    }

    
    
    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

 
    void display() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }




    public static void main(String[] args) {
        // Using default constructor
        Que_02 c1 = new Que_02();
        System.out.println("Circle 1:");
        c1.display();

        System.out.println();

        // Using parameterized constructor
        Que_02 c2 = new Que_02(5.5);
        System.out.println("Circle 2:");
        c2.display();
    }
}

    










