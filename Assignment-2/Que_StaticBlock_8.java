public class Que_StaticBlock_8 {
    static int number;
    static{
            number=20;
    }
    public static void main(String[] args) {
        System.out.println("static variable executed =>" +number);
    }
}
