import java.util.HashMap;;
public class Que_02 {
    public int majorityElement(int[] nums) {
         int res=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if((map.containsKey(nums[i]))==true){
                int old=map.get(nums[i]);
                int upd=old+1;
                map.put(nums[i],upd);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int i=0;i<nums.length;i++){
            int count=0;
            int max=0;
           
            if((map.containsKey(nums[i]))==true){
                 count=map.get(nums[i]);
            }
            if(count>max){
                 res=nums[i];
                max=Math.max(max,count);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Que_02 obj1=new Que_02();
        int nums[]=new int[]{1,2,3,4,2,5,2,9,2};
        System.err.println(obj1.majorityElement(nums));
    }

}

