import java.util.Scanner;
public class Que_07 {
    public static void generateException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert into a number: ");
        String text = sc.nextLine(); 

        int number = Integer.parseInt(text);

        System.out.println("Converted number: " + number);
    }

    public static void handleException() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to convert into a number (handled version): ");
        String text = sc.nextLine(); 

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid number. " + e);
        } catch (RuntimeException e) {
            System.out.println("A runtime exception occurred: " + e);
        }
    }

    public static void main(String[] args) {
        System.out.println("Demo: Generate NumberFormatException");
    
        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException in main: " + e);
        }

        System.out.println("\nDemo: Handle NumberFormatException with try-catch");
        handleException();
    }
}

