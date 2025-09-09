class Que_10 {

    public int rollNumber;      
    protected String name;      // Protected: accessible in subclass and package
    private double CGPA;        

  
    Que_10(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if(CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0.0 and 10.0");
        }
    }

    
    public void displayStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
        System.out.println("-----------------------");
    }
}

// Subclass
class PostgraduateStudent extends Que_10 {
    String specialization;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    void displayPostgraduateStudent() {
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name);             
        System.out.println("CGPA: " + getCGPA());       // we use the getCGPA methord because cgpa is private we can not access directlt
        System.out.println("Specialization: " + specialization);
        System.out.println("-----------------------");
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
      
        Que_10 s1 = new Que_10(101, "Alice", 8.5);
        s1.displayStudent();

        
        s1.setCGPA(9.0);
        System.out.println("After updating CGPA:");
        s1.displayStudent();

        
        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 9.2, "Data Science");
        pg.displayPostgraduateStudent();
    }
}
