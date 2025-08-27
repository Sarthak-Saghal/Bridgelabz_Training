import java.util.Scanner;

public class Que_08 {
    public static void fibo( int n){
        int first=0;
        int second=1;
    
        while (first<n) {
            System.out.println(first+" ");
            int temp=first+second;
            first=second;
            second=temp;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("fibonacci series is");
        fibo(num);
    }

    
}