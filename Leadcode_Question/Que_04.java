import java.util.HashSet;;
public class Que_04 {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=getsquareOfn(n);
        }
        return n==1;
    }

    public int getsquareOfn(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=19;
        Que_04 obj1=new Que_04();
        System.err.println(obj1.isHappy(n));
    }
}

