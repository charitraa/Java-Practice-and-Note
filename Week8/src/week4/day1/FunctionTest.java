package week4.day1;
import java.util.Scanner;
public class FunctionTest {
	public static void main(String[] args) {
		//System.out.println("Hello");
		int x=0;
		int y=0;
		int z=0;
		System.out.print("Enter first no : ");
		x = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter second no : ");
		y = Integer.parseInt(new Scanner(System.in).nextLine());
		z = sum(x,y);
		System.out.println("RESULT : "+z);
	}
	public static int sum(int a, int b) {
		return a+b;
	}
}
