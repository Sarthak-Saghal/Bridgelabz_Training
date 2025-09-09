public class Que_08 {

    

 
    String courseName;
    int duration; // in weeks
    double fee;

    
    static String instituteName = "Global Institute";

    Que_08(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("----------------------------");
    }

    
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }


    public static void main(String[] args) {
   
        Que_08 c1 = new Que_08("Java Programming", 12, 500.0);
        Que_08 c2 = new Que_08("Data Science", 16, 800.0);

       
        System.out.println("Before updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Que_08.updateInstituteName("Tech Academy");

       
        System.out.println("After updating institute name:");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
