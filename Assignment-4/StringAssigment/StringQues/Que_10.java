package String;
import java.util.*;
public class Que_10 {
	public static String reverseWord(String str) {
        String[] words = str.split(" "); 
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";

            
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord += word.charAt(j);
            }

            result += reversedWord;

           
            if (i != words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String result = reverseWord(str);

        System.out.println("Reversed words: " + result);
    }
}
