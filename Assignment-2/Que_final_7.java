public class Que_final_7 {
    final int number=20;
    void setval(){
        //number=30;
         // error: cannot assign a value to final variable number
    }
    public static void main(String[] args) {
        Que_final_7 obj1=new Que_final_7();
        obj1.setval();
    }
}
