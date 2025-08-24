 import java.util.Scanner;

public class Que_14 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong(); 

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        
        while (number != 0) {
            int digit = (int)(number % 10);
            digits[index] = digit;
            index++;

            if (index == maxDigit) {
                maxDigit += 10; 
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                digits = temp; 
            }

            number = number / 10;
        }

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];

            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.print("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println("");
        System.out.println("Largest digit => " + largest);

        if (secondLargest != -1) {
            System.out.println("Second Largest digit => " + secondLargest);
        } else {
            System.out.println("Second Largest digit not found");
        }
    }
}


