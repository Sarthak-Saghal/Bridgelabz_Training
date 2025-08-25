package String;
import java.util.*;

public class Que_11 {
	public static String removeDuplicates(String str) {
        String result = "";
        boolean[] ascii = new boolean[256]; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!ascii[ch]) {  
                result += ch;  
                ascii[ch] = true; 
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeDuplicates(str);

        System.out.println("String after removing duplicates: " + result);
    }

}
