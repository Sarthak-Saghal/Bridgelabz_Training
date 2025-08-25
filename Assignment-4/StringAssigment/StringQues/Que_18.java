package String;
import java.util.*;
public class Que_18 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring: ");
        String subStr = sc.nextLine();

        boolean found = false;

        
        for (int i = 0; i <= mainStr.length() - subStr.length(); i++) {
            int j;
            for (j = 0; j < subStr.length(); j++) {
                if (mainStr.charAt(i + j) != subStr.charAt(j)) {
                    break; 
                }
            }
            if (j == subStr.length()) {
                found = true; 
                break;
            }
        }

        if (found) {
            System.out.println("Substring found!");
        } 
        else {
            System.out.println("Substring not found.");
        }
    }
	
}

