import java.util.Scanner;

public class Que_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceFeet = input.nextDouble();

        double distanceYards = distanceFeet / 3.0;
        double distanceMiles = distanceYards / 1760.0;

        System.out.println("The distance in yards is " + distanceYards + " while the distance in miles is " + distanceMiles);
    }
}
