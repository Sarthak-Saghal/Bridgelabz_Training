import java.util.*;
public class Que_08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number=> ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factor = new int[count];
        int idx = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factor[idx] = i;
                idx++;
            }
        }

        System.out.print("Factors of " + num + " are => ");
        for (int i = 0; i < factor.length; i++) {
            System.out.print(factor[i] + " ");
        }
    }
}


