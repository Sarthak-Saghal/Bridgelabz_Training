import java.util.Scanner;
public class Que_07 {
  public static int getnumber(Scanner sc,String message){
    System.out.print(message);
    return sc.nextInt();
  }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int number=getnumber(sc, "Enter the number");

        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        sc.close();
    }
}

