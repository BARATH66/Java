import java.lang.*;
import java.util.Scanner;

public class Reverse_num{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a value to reverse: ");
		int num = sc.nextInt();
		int rev = 0;
		while (num != 0){
			int N = num%10;
			rev = N + (rev*10);
			num /= 10;
		}
		System.out.println("Reverse value of "+num+" is "+rev); 
	}
}