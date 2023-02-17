import java.lang.*;
import java.util.Scanner;

class Even_Odd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i=0;i<n;i++){
			System.out.print("Enter value to arr["+i+"]: ");
			int v = sc.nextInt();
			arr[i] = v; 
		}
		int even = 0, odd=0;
		for ( int ele : arr){
			if (ele%2 == 0){
				++even;
			}
			else{
				++odd;
			}
		}
		System.out.println("No.of Even numbers are: "+even);
		System.out.print("No.of Odd numbers are: "+odd); 
	}
}