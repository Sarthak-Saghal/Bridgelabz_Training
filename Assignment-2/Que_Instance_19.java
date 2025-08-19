public class Que_Instance_19 {
    String name;
    Que_Instance_19(String name){
        this.name=name;
    }
    void display(){
        System.out.println("name => "+name);
    }
    public static void main(String[] args) {
        Que_Instance_19 obj1=new Que_Instance_19("sarthak");
        Que_Instance_19 obj2=new Que_Instance_19("Jatin");
        obj1.display();
        obj2.display();
    }
}
