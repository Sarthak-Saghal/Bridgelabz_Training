public class Que_Car_1{
    String model;
    int year;
    Que_Car_1(String model , int year){
        this.model=model;
        this.year=year;
    }
    void display(){
        System.out.println(model+" " + year );
        System.out.println("");
    }
    public static void main(String[] args) {
        Que_Car_1 obj1=new Que_Car_1("Tata", 2025);
        Que_Car_1 obj2=new Que_Car_1("Mahindra", 2023);

        obj1.display();
        obj2.display();
    }
}