public class Que_03 {

    String name;
    int age;

    // Parameterized constructor
    Que_03(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Que_03(Que_03 p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }



    public static void main(String[] args) {
        // Original person
        Que_03 p1 = new Que_03("Sarthak", 21);
        System.out.println("Original Person:");
        p1.display();

        System.out.println();

        // Copy using copy constructor
        Que_03 p2 = new Que_03(p1);
        System.out.println("Cloned Person:");
        p2.display();
    }

}