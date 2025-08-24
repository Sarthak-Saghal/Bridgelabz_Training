import java.util.Scanner;
public class Que_03 {

	public static void main(String[] args) {
		double[] arr = new double[10];
		Scanner sc = new Scanner(System.in);
		int i =  0;
		while(i<10) {
			double n = sc.nextDouble();
			if(n<=0) {
				break;
			}
			arr[i] = n;
			i++;
		}
		double total =0.0;
		for(int j = 0;j<10;j++) {
			total+=arr[j];
		}
		System.out.println(total);
	}
}

