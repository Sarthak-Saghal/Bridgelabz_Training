public class Que_Demo_6 {
    int number=60;
    
    void shownumber(){
        int number=20;

        System.out.println("Local variable number => " +number);
        System.out.println("Instance variable number => " +this.number);
    }
    public static void main(String[] args) {
        Que_Demo_6 obj1=new Que_Demo_6();
        obj1.shownumber();
    }
}
