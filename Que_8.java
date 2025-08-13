import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        float length=sc.nextFloat();
        System.out.println("Enter the width");
        float width=sc.nextFloat();
        
        float perimeter=2*(length+width);
        System.out.println("perimeter of rectangle =>" + perimeter);
    }
}
