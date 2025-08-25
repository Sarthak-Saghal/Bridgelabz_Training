package String;
import java .util.*;

public class Que_02 {
	public static String ToUpperCaseString(String str1) {
		 String result = "";
	        for (int i = 0; i < str1.length(); i++) {
	            char ch = str1.charAt(i);

	            
	            if (ch >= 'a' && ch <= 'z') {
	                ch = (char)(ch - 32);
	            }

	            result += ch;
	        }
	        return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner (System.in);
		String str1=sc.next();
		String result=ToUpperCaseString(str1);
		System.out.println("String Converted to UpperCase=>  "+result );
	}
}
