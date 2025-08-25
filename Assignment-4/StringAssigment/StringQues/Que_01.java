package String;
import java.util.*;
public class Que_01 {
	public static boolean checkIsEqual(String str1 , String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String ");
		String str1=sc.next();
		System.out.println("Enter the Second String");
		String str2=sc.next();
		
		boolean check= checkIsEqual(str1, str2);
		
		if(check) {
			System.out.println("String First and String Second both are equal");
		}
		else {
			System.out.println("Strings are not equals");
		}
	}

}
