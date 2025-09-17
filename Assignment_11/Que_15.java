import java.util.Scanner;

public class Que_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int original = num;
        int sum = 0;

        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original = original / 10;
        }

        if (num == sum) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
