public class Que_Variable_15 {
    void local(){
        int local;
        System.out.println(local);
    }
    public static void main(String[] args) {
        Que_Variable_15 obj1=new Que_Variable_15();

        obj1.local();
    }

    // error ==> variable local might not have been initialized

    /*rearon==> Instance variable in java get the default value according to the datatype
                but in the local variable do not get the default values the compiler forces the user to assign some value to the local 
                variable before use it according to the datatype, this prent you  from accidently using the garbage data from the memory.
    */
}
