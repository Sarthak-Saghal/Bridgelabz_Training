import java.util.Scanner;

public class Que_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int minLen = Math.min(str1.length(), str2.length());
        int result = 0;

        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if (result == 0 && str1.length() != str2.length()) {
            result = str1.length() - str2.length();
        }

        if (result < 0) {
            System.out.println("First string comes before second string.");
        } else if (result > 0) {
            System.out.println("First string comes after second string.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }
}

