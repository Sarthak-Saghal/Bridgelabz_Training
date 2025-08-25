package String;
import java.util.*;
public class Que_14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String result = "";
        boolean capitalizeNext = true; 

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ' ') {
                result += ch;           
                capitalizeNext = true;  
            } 
            else if (capitalizeNext) {
               
                if (ch >= 'a' && ch <= 'z') {
                    ch = (char)(ch - 32); 
                }
                result += ch;
                capitalizeNext = false;
            }
            
            else {
                result += ch; 
            }
            
        }

        System.out.println("Capitalized sentence: " + result);
    }
}
