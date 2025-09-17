import java.util.Scanner;

public class Que_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();

        if (year >= 1582) {
            if (year % 400 == 0) {
                System.out.println("Year " + year + " is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Year " + year + " is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year " + year + " is a Leap Year");
            } else {
                System.out.println("Year " + year + " is not a Leap Year");
            }
        } else {
            System.out.println("Year " + year + " is not valid for Gregorian calendar");
        }
    }
}
