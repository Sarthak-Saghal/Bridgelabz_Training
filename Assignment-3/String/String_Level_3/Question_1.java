import java.util.*;

public class Question_1 {

    
    public static char[] findUniqueChars(String str) {
        Set<Character> set = new LinkedHashSet<>(); 
        for (char c : str.toCharArray()) {
            set.add(c);
        }

        char[] uniqueChars = new char[set.size()];
        int i = 0;
        for (char c : set) {
            uniqueChars[i++] = c;
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] uniqueChars = findUniqueChars(input);

        System.out.print("Unique characters are: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
