import java.util.Random;
import java.util.Scanner;
public class Que_05 {
    public static int generaterandom(int low ,int high){
        Random ran=new Random();
        return ran.nextInt(high-low+1)+low;
    }
    public static String getFeedback(int guess,Scanner sc){
        System.out.println("Is your number " + guess + "?");
        System.out.print("Enter 'low' if too low, 'high' if too high, 'correct' if right: ");
        return sc.nextLine().trim().toLowerCase();

    }

        // Game loop
    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!found && low <= high) {
            int guess = generaterandom(low, high);
            String feedback = getFeedback(guess, sc);

            if (feedback.equals("low")) {
                low = guess + 1; 
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number: " + guess);
                found = true;
            } else {
                System.out.println("Invalid input! Please enter 'low', 'high', or 'correct'.");
            }
        }

        if (!found) {
            System.out.println("Hmm, something went wrong. Did you change your number? 😅");
        }

        sc.close();
    }

    public static void main(String[] args) {
        playGame();
    }
}
    

