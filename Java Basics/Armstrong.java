import java.lang.*;
import java.util.Scanner;

public class Armstrong{
	public static void main(String args[]){
		//Scanner sc = new Scanner(System.in);
	//	System.out.print("Enter a number: ");
		//int num = sc.nextInt();
		for (int i = 100; i<=999; i++){
			int n = i, temp=0;
		while (n !=0){
			int N = n%10;
			temp += (N*N*N);
			n /= 10;
		}
		if (temp == i){
			System.out.println(i+" is an Armstrong number.");
		}
		//else{
		//	System.out.println(i+" is not an Armstrong number.");
		//}
		}
	}
}