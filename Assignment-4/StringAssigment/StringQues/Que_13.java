package String;
import java.util.*;
public class Que_13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

   
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {  
                result += ch;
            }
        }

        System.out.println("String without digits: " + result);
	    
	}

}
