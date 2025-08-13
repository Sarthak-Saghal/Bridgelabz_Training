public class Que_Student_13 {
    String name;
    int marks;

    Que_Student_13(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    void calculate_result(){
        if(marks>=40){
            System.out.println(this.name+" is passed");
        }

        else{
            System.out.println(this.name+" is failed");
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Marks:"+marks);
        calculate_result();
        System.out.println("");
    }

    public static void main(String[] args) {
        Que_Student_13 obj1=new Que_Student_13("Sarthak",90);
        Que_Student_13 obj2 =new Que_Student_13("jatin", 50);

        obj1.display();
        obj2.display();
    }
}
