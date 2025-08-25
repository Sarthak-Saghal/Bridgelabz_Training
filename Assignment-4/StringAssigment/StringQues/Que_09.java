package String;
import java.util.*;

public class Que_09 {
	public static void printAscii(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch; // Convert character to ASCII value
            System.out.println("Character: " + ch + " -> ASCII: " + ascii);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printAscii(str);
    }
}
