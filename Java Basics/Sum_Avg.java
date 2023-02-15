import java.lang.*;
import java.util.Scanner;

public class Sum_Avg{
	public static void main(String args[]){
		System.out.print("Enter Limit: ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		int sum = 0;
		for (int i=0; i<limit; i++){
			int temp = sc.nextInt();
			sum += temp;
		}
		int avg = sum/limit;
		System.out.println("Sum of "+limit+" is "+sum);
		System.out.println("Average of "+limit+" is "+avg); 
	}
}