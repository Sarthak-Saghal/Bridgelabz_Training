
public class Que_01{

    String name;
    int id;
    double salary;

    Que_01(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

  
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("---------------------------");
        System.out.println("");
    }



    public static void main(String[] args) {

        Que_01 obj1 = new Que_01("Alice", 101, 55000.50);
        Que_01 obj2 = new Que_01("Bob", 102, 62000.75);

       
        obj1.displayDetails();
        obj2.displayDetails();
    }
}

