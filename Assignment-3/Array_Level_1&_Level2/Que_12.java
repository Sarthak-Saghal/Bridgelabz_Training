import java.util.Scanner;
public class Que_12 {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i] + ":");

            System.out.print("Age: ");
            age[i] = sc.nextInt();

            System.out.print("Height (in cm): ");
            height[i] = sc.nextDouble();
            System.err.println(" ");
        }

        int young = 0;
        int tallest = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[young]) {
                young = i;
            }
            if (height[i] > height[tallest]) {
                tallest = i;
            }
        }

       
        System.out.println("Youngest friend is " + names[young] + " with age " + age[young]);
        System.err.println(" ");
        System.out.println("Tallest friend is " + names[tallest] + " with height " + height[tallest] + " cm");
    }
}


