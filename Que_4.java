import java.util.Scanner;

public class Que_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        Float radius=sc.nextFloat();

        float area= 3.14159f *radius*radius;

        System.out.println("Area of circle =>"+ area);
    }
}
