import java.util.*;
public class Que_03 {
 
  
    public static char[] customToCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a string=> ");
        String text = sc.nextLine();

    
        char[] customArray = customToCharArray(text);


        char[] builtInArray = text.toCharArray();

   
        boolean isEqual = compareCharArrays(customArray, builtInArray);

        
        
        System.out.print("Custom char array=> ");
        for (char c : customArray) {
            System.out.print(c + " ");
        }
        System.out.println("");
        System.out.print("Built-in char array=> ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.err.println("");

        System.out.print("Arrays are equal " + isEqual);

        
    }
}


