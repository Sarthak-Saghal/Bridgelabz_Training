import java.util.Scanner;

public class Que_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();
        System.out.println("Enter the num2");
        int num2=sc.nextInt();
        System.out.println("Enter the num3");
        int num3=sc.nextInt();

        float average=(num1+num2+num3)/3;
        System.out.println("Average of the number =>" +average);
    }
}
