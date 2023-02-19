import java.lang.*;
import java.util.Scanner;

public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		int f =0;
		if (num>1){
			for (int i = 1; i<=num; i++){
				if (num%i == 0){
					System.out.println(i);
					++f;
					//System.out.print(f);
				}
			}
			if (f==2){
				System.out.print(num+" is a prime number");
			}
			else{
				System.out.print(num+" is Not a prime number");
			}
		}
		else{
			System.out.println(num);
		}
	}
}