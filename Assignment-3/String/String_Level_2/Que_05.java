import java.util.*;;

public class Que_05 {

    public static void generateException(String text) {
        System.out.println("Generating Exception");
     
        char ch = text.charAt(text.length()); 
        System.out.println("Character: " + ch); 
    }

    
    public static void handleException(String text) {
        System.out.println(" Handle Exception ");
        try {
            char ch = text.charAt(text.length());
            System.out.println("Character: " + ch);
        } 
        
        catch (StringIndexOutOfBoundsException e) {

            System.out.println("Exception caught: " + e);
            System.out.println("Message: " + e.getMessage());
        }
        System.out.println("Program continues safely after handling...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String text = sc.next();

      
        try {
            generateException(text);
        } 
        catch (Exception e) {
            System.out.println("Program stopped abruptly due to: " + e);
        }
        handleException(text);

    }
}


