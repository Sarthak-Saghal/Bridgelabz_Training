package String;
import java.util.*;
public class Que_05 {
	 public static boolean isPalindrome(String str) {
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	           
	            if (str.charAt(start) != str.charAt(end)) {
	                return false; 
	            }
	            start++;
	            end--;
	        }
	        return true; 
	    }
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter the string");
			String str=sc.next();
			boolean result=isPalindrome(str);
			if(result) {
				System.out.print("String is Palindrome");
			}
			else {
				System.out.print("String is not Palindrome");
			}
	}
}
