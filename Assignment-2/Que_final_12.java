public class Que_final_12 {
    final int userid;
    String name;

    Que_final_12(int userid,String name){
        this.userid=userid;
        this.name=name;
    }
    void display(){
        System.out.println("userid => "+userid +" name => "+name );
    }
    public static void main(String[] args) {
        Que_final_12 obj1=new Que_final_12(2315, "sarthak");
        Que_final_12 obj2=new Que_final_12(2319, "Addi");
        obj1.display();
        obj2.display();
    }
}
