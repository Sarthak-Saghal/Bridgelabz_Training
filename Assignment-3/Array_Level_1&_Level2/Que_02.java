 import static java.lang.System.out;

import java.util.Scanner;

 public class Que_02 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            out.print("Enter the Number"+(i+1)+"  ");
            Scanner sc=new Scanner(System.in);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]>0){
                if(arr[i]%2==0){
                    out.println("Number"+arr[i]+"is positive and the number is even");
                }
                else{
                    out.println("Number"+arr[i]+"is positive and the number is odd");
                }
            }
            else if(arr[i]<0){
                out.println("Number"+arr[i]+"is Negative");
            }
        }
        if(arr[0]>arr[arr.length-1]){
            out.println(arr[0]+" is greater then "+arr[arr.length-1]);
        }
        else if(arr[0]==arr[arr.length-1]){
            out.println(arr[0]+" is equal to "+arr[arr.length-1]);
        }
        else{
            out.println(arr[0]+" is less than "+arr[arr.length-1]);
        }
    }
}
