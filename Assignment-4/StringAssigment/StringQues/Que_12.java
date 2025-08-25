package String;
import java.util.*;

public class Que_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter string 1: ");
	    String str = sc.nextLine();
	    System.out.print("Enter string 2: ");
	    String str1 = sc.nextLine();
	    int[] freq = new int[256];
	    for(char c:str.toCharArray()) {
	    	freq[c]++;
	    }
	    for(char c:str1.toCharArray()) {
	    	freq[c]--;
	    }
	    for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
            	System.out.println("Not A Anagrams");
            	return;
            }
        }
	    System.out.print("Anagrams");
	    
	}

}
