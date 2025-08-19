public class Que_AllVariable_10 {
    int number=20;

    static int num=40;

    void local(){
        number=50;
        System.err.println("value of local variable =>"+ number);
    }
    public static void main(String[] args) {
        Que_AllVariable_10 obj1=new Que_AllVariable_10();
        System.err.println("value of Instance variable =>"+ obj1.number);
        System.err.println("value of Static variable =>"+ num);
        obj1.local();
    }
}
