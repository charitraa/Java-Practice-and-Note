package week2.day1;
//Library
import java.util.Scanner;

public class Week2Day1 {
	public static void main(String []args) {
		//System.out.println("Hello");
		
		// Expression and Statement
		// instruction to cpu
		//int num1 = 10+20;
		//int num2;
		
		//Task-1
//declare
		int num1, num2, num3; //multiple variable decalre
		
//input
		System.out.print("Enter first no : "); //prompt for user
		num1  = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter second no : ");
		num2 = Integer.parseInt(new Scanner(System.in).nextLine());
//process
		num3 = num1 + num2;
//output
		System.out.println("Sum : "+num3);
	}
}
