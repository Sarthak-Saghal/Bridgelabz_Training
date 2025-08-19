public class Que_Student_4 {
    String name;
    int marks;
    
    void display(){
        System.out.println("Name is => "+ name +"  marks is => "+marks);
    }
    
    public static void main(String[] args) {
        Que_Student_4 obj1=new Que_Student_4();
        obj1.name="Sarthak";
        obj1.marks=90;
        Que_Student_4 obj2=new Que_Student_4();
        obj2.name="Rudra";
        obj2.marks=80;
        obj1.display();
        obj2.display();
    }
}
