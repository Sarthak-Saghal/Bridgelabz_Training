import java.util.Scanner;

public class Que_01 {

    public static void main(String[] args) {
        int[] student=new int[10];
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<10;i++){
            System.out.print("Enter the age of Student "+(i+1)+"  ");
            student[i]=sc.nextInt();
        }

        for(int i=0;i<student.length;i++){
            if(student[i]<=0){
                System.out.println("Invalid age");
            }

            else if(student[i]<18){
                System.out.println("The student with the age " + student[i]+ " cannot vote");
            }
            else{
                System.out.println("The student with the age" + student[i]+ "can vote");
            }

        }
        
    }
 
}