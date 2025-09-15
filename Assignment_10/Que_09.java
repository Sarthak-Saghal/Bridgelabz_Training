import java.util.Scanner;

public class Que_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        char mostFreq = str.charAt(0);
        int max = freq[mostFreq];
        for (int i = 1; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                mostFreq = str.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: '" + mostFreq + "'");
    }
}

