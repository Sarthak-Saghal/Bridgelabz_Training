import java.util.Scanner;

public class Que_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks in Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks in Maths: ");
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks: " + average);

        if (average >= 90) {
            System.out.println("Grade: A+ | Remarks: Excellent");
        } else if (average >= 75) {
            System.out.println("Grade: A | Remarks: Very Good");
        } else if (average >= 60) {
            System.out.println("Grade: B | Remarks: Good");
        } else if (average >= 40) {
            System.out.println("Grade: C | Remarks: Pass");
        } else {
            System.out.println("Grade: F | Remarks: Fail");
        }
    }
}
