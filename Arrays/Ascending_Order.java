import java.util.Scanner;
import java.util.Arrays;

public class Ascending_Order{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter value of arr["+i+"]: ");
			int a = sc.nextInt();
			arr[i] = a;
		}
		
		System.out.println("Array before sorting: "+ Arrays.toString(arr));
		for( int i = 0; i<arr.length-1; i++){
			for (int j=i+1; j<arr.length; j++){
				if (arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array after sorting: "+Arrays.toString(arr)); 
	}
}