import java.util.*;
 import java.util.Scanner;
public class Que_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive Nunber: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println(" Enter a positive Number.");
            return;
        }

        String[] results = new String[num + 1]; 

        for (int i = 0; i <= num; i++) {

            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } 

            else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } 

            else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } 

            else {
                results[i] = String.valueOf(i);
            }
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
    }
}


