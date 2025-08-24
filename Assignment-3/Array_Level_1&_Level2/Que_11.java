import java.util.Scanner;

public class Que_11 {

  


    public static void main(String[] args) {
        int totalEmployees = 10;

        Scanner sc = new Scanner(System.in);

        double[] salary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] bonus = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];

        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double yrs = sc.nextDouble();

            
            if (sal <= 0 || yrs <= 0) {
                System.out.println(" Invalid input! Enter all the detail again ");
                i--; 
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < totalEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; 
            }
            
            else {
                bonus[i] = salary[i] * 0.02; 
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }


        System.out.println("------------------------------------ Employee Salary Details-------------------------------------");
        System.err.println("");
        System.err.println("");
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +", Bonus = " + bonus[i] +", New Salary = " + newSalary[i]);
        }

        System.out.println("-------------------------------------------Total----------------------------------------------------");
        System.err.println("");
        System.err.println("");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);
    }
}


