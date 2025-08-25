package String;
import java.util.*;
public class Que_20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter words separated by space: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");

        
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars); 
            String key = new String(chars);

         
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }

        
        System.out.println("Groups of anagrams:");
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}
