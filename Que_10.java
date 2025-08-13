import java.util.Scanner;

public class Que_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in kilometers");
        float distance=sc.nextFloat();
        
        float miles= distance*0.621371f;
        System.out.println("Distance in miles => " +miles);
    }
}
