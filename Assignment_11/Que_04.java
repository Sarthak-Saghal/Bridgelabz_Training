import java.util.Scanner;

public class Que_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num >= 0) {
            int total = num * (num + 1) / 2;
            System.out.println("The sum of " + num + " natural numbers is " + total);
        } else {
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
