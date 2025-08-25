package String;
import java.util.*;
public class Que_17 {
	public static String[] ownSplit(String str, char delimiter) {
        ArrayList<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == delimiter) {
            	
                if (!word.equals("")) {    
                    words.add(word);
                    word = "";
                }
            }
            
            else {
                word += ch;                  
            }
        }

       
        if (!word.equals("")) {
            words.add(word);
        }

      
        String[] result = new String[words.size()];
        for (int i = 0; i < words.size(); i++) {
            result[i] = words.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String[] words = ownSplit(str, ' '); 

        System.out.println("Words in the string:");
        for (String w : words) {
            System.out.println(w);
        }
    }
}
