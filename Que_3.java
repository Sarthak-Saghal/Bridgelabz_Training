import java.util.Scanner;

public class Que_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius");
        float temp_Celsius= sc.nextFloat();

        float temp_fahrenheit=(temp_Celsius*9/5)+32;

        System.out.println("Temperature in fahrenheit => " +temp_fahrenheit);
    }
}
