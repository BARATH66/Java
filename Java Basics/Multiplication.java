import java.lang.*;
import java.util.Scanner;

public class Multiplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and times");
		int n = sc.nextInt(), t  = sc.nextInt();
		for (int i=1; i<=n; i++){
			System.out.println(t+"x"+i+"= "+t*i);
		}
	}
}