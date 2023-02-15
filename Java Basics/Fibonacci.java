import java.lang.*;
import java.util.Scanner;

public class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int fibo = 0;
		int F0 = -1, F1 = 1;
		for (int i=0; i<= num; i++){
			fibo = F0+F1; 
			F0 = F1;
			F1 = fibo;
			System.out.println(fibo);
		}
	}
}
