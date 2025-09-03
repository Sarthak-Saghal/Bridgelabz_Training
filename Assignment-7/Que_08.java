public class Que_08 {
  
    String text;
    Que_08(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleanText = text.replaceAll("[^a-z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanText.length() - 1;

        while (left < right) {
            if (cleanText.charAt(left) != cleanText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {
        
        Que_08 p1 = new Que_08("madam");
        Que_08 p2 = new Que_08("hello");
        Que_08 p3 = new Que_08("Race car");

       
        p1.displayResult();
        p2.displayResult();
        p3.displayResult();
    }


}
