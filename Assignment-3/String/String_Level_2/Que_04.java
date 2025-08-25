public class Que_04 {
  

   
    public static void generateException() {
        String str = null; 
      
        System.out.println("Length of text: " + str.length());
    }

    
    public static void handleException() {
        String str = null; 
        try {
          
            System.out.println("Length of text: " + str.length());
        } 
        
        catch (NullPointerException e) {
            System.out.println("Caught NullPointerException! Reason: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
       // generateException();
       
        handleException();
    }
}


