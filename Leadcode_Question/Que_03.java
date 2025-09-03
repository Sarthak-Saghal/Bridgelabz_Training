public class Que_03 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        Que_03 obj1=new Que_03();
        System.out.println(obj1.isPalindrome(str));
    }
}
