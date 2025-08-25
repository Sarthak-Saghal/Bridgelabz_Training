package String;
import java.util.*;

public class Que_04 {
	public static int StringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.next();
		int result=StringLength(str);
		System.out.print("Length of the String is=> "+ result);
	}
}
