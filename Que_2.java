import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();

        int ans=num1+num2;
        System.out.print("sum of num1 and num2 => "+ ans);
    }
}
