import java.util.Scanner;

public class Que_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        System.out.println("Is the first number the largest? " + (first >= second && first >= third));
        System.out.println("Is the second number the largest? " + (second >= first && second >= third));
        System.out.println("Is the third number the largest? " + (third >= first && third >= second));
    }
}
