package String;
import java.util.*;
public class Que_21 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        String prefix = arr[0];
        for (String s : arr) {
            while (!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) break;
            }
        }
        System.out.println("Longest common prefix: " + prefix);
    }
}
