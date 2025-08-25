import java.util.*;
public class Que_02 {
    
    public static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < str.length(); i++) {
            result += str.charAt(i);
        }
        return result;
    }

   
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        
        String manual = manualSubstring(text, start, end);

        String builtIn = text.substring(start, end);

       
        boolean isEqual = compareStrings(manual, builtIn);

    
        System.out.println("Manual substring (charAt): " + manual);
        System.out.println("Built-in substring: " + builtIn);

        if (isEqual) {
            System.out.println(" Both substrings are SAME.");
        } else {
            System.out.println(" Substrings are DIFFERENT.");
        }

        
    }
}


