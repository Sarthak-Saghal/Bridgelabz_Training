public class Que_01 {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        return (combine(word1).equals(combine(word2)));
        
    }
    public String combine(String[] arr){
        String s="";
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        return s;
    }
    public static void main(String[] args) {
        Que_01 obj1=new Que_01();
        String[] str1={"ab","c"};
        String[] str2={"a","bc"};
        System.err.println(obj1.arrayStringsAreEqual(str1,str2));
    }
}
