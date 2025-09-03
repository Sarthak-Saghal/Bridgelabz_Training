public class Que_06{

    String name;
    int rollNumber;
    double marks;

   Que_06(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D (Fail)";
        }
    }

    void displayDetails() {
        System.out.println("Student Report:");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
   
        Que_06 obj1 = new Que_06("Ravi", 101, 92.5);
        Que_06 obj2 = new Que_06("Neha", 102, 78.0);
        Que_06 obj3 = new Que_06("Amit", 103, 45.0);


        obj1.displayDetails();
        obj2.displayDetails();
        obj3.displayDetails();
    }


}