import java.util.Scanner;

public class Que_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        float radius=sc.nextFloat();
        System.out.println("Enter the height");
        float height=sc.nextFloat();

        float volume= 3.14159f*radius*radius*height;
        System.out.println("Volume of Cylinder => " +volume);
    }
}
