package String;
import java.util.*;
public class Que_16 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder toggled = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                toggled.append((char)(ch - 32));
            } 
            
            else if (ch >= 'A' && ch <= 'Z') {
                toggled.append((char)(ch + 32)); 
            }
            
            else {
                toggled.append(ch); 
            }
        }

        System.out.println("Toggled string: " + toggled);
    }
}
