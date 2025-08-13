 class Que_12 {
    static int count=0;

    void setcount(int val){
        count=val;
    }
    
    void displayCount(){
        System.out.println("Count => "+count);
    }

}

public class Que_Static_12 {
    public static void main(String[] args) {
        Que_12 obj1=new Que_12();
        Que_12 obj2=new Que_12();

        obj1.setcount(20);
        System.out.println("from obj1:");
        obj1.displayCount();

        System.out.println("from obj2:");
        obj2.displayCount();

        obj2.setcount(40);
        System.out.println("from the obj1 after change in obj2:");
        obj1.displayCount();

        System.out.println("from obj2 after the change");
        obj2.displayCount();
    }

    
}