public class Que_Variable_14 {
    int number=50;

    void local(){
        int  number=60;
        System.out.println("Local variable value: "+number);
        System.out.println("Instance variable value:"+this.number);
    }

    public static void main(String[] args) {
        Que_Variable_14 obj1=new Que_Variable_14();
        obj1.local();
    }

}
