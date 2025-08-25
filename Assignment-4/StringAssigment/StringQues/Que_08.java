package String;
import java.util.*;

public class Que_08 {
	public static String replacespace(String str) {
	 String result = "";
     for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (ch == ' ') {
             result += '-';
         } else {
             result += ch;
         }
     }
     return result;
	}
	
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

	     System.out.print("Enter a string: ");
	     String input = sc.nextLine();

	     String output = replacespace(input);

	     System.out.println("String after the Change=>  " + output);
	 }
 }

 

