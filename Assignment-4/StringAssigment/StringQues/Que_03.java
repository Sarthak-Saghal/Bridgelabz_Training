package String;
import java .util.*;

public class Que_03 {
	public static int countVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            
            else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }

        return count;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string ");
        String input = sc.nextLine();

    
        int vowelCount = countVowels(input);

        System.out.println("Number of vowels in the string=> " + vowelCount);
	}
}
