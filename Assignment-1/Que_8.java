import java.util.Scanner;

public class Que_8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the base");
        int base=sc.nextInt();
        System.out.println("Enter the exponent");
        int exponent=sc.nextInt();
        
        int power=(int)Math.pow(base, exponent);

        System.out.println("power of given base and exponent => " +power);
    }
}
