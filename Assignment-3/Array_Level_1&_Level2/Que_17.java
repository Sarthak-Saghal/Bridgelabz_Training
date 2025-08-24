import java.util.Scanner;
public class Que_17 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;

            while (true) {
                System.out.print("Enter weight of person " + (i + 1) + " (kg): ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Weight must be positive. Try again.");
            }

            while (true) {
                System.out.print("Enter height of person " + (i + 1) + " (meters): ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Height must be positive. Try again.");
            }

            // Calculate BMI
            double bmi = weight / (height * height);

            
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

    
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        
        System.out.println("--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.println(
                "Person " + (i + 1) + ": " +
                "Weight = " + personData[i][0] + " kg, " +
                "Height = " + personData[i][1] + " m, " +
                "BMI = " + String.format("%.2f", personData[i][2]) + ", " +
                "Status = " + weightStatus[i]
            );
        }

    
    }
}

