import java.util.*;

public class SwapWithOutVar{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		System.out.println("Before Swap:"+"\n"+"First: "+num1+"\n"+"Second: "+num2);
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.print("----------------------------------------------------------------");
		System.out.println("After Swap:\n"+"First: "+num1+"\n"+" Second: "+num2);
	}
}