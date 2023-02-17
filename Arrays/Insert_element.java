import java.util.*;

public class Insert_element{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit: ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter value of arr["+i+"]: ");
			//int a = sc.nextInt();
			arr[i] = sc.nextInt();
		}
		System.out.print("Array before change: "+ Arrays.toString(arr));
		System.out.println("Enter position: ");
		int pos = sc.nextInt();
		System.out.println("Enter Value: ");
		int val = sc.nextInt();
		for (int i=0; i<n; i++){
			if (i == pos){
				arr[i] = val;
			}
		}
		System.out.print("Array after change: "+Arrays.toString(arr));
	}
}