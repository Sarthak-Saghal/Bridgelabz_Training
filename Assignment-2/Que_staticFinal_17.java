public class Que_staticFinal_17 {
    static final float pi=3.14f;
     Que_staticFinal_17(){
                    //error: cannot assign a value to static final variable pi
        //pi=3.1432f;
    }

    public static void main(String[] args) {
        Que_staticFinal_17 obj1= new Que_staticFinal_17();
        System.out.println(pi);
    }
}
