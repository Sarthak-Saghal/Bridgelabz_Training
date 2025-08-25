package String;
import java.util.*;
public class Que_07 {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

       
        StringTokenizer st = new StringTokenizer(str);

       
        int wordCount = st.countTokens();

        System.out.println("Number of words: " + wordCount);
    }
}

