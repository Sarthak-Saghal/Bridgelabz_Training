public class Que_Static_5 {
 
    static int TotalStudent_In_CLass=0;

    void setcount(int val){
        TotalStudent_In_CLass=val;
    }

    void displayCount(){
        System.out.println("TotalStudent_In_CLass =>" +TotalStudent_In_CLass);

    }
    public static void main(String[] args) {
        Que_Static_5 obj1=new Que_Static_5();
        Que_Static_5 obj2=new Que_Static_5();

        obj1.setcount(20);
        System.out.println("from obj1:");
        obj1.displayCount();
        System.out.println("");

        System.out.println("from obj2:");
        obj2.displayCount();
        System.out.println("");

        obj2.setcount(40);
        System.out.println("from the obj1 after change in obj2:");
        obj1.displayCount();
        System.out.println("");

        System.out.println("from obj2 after the change");
        obj2.displayCount();
        System.out.println("");
    }

    
}