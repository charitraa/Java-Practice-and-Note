package week8.day1;

import java.util.Scanner;

public class ExceptionHandle1 {

	public static void main(String[] args) {
		//Error in Program
		//Syntax Error - Java Language Error
		//Runtime Error - Type, Range Error
		//Logical Error - Operator Error
		
		//Runtime Error - Type, Range Error - Validation
		// Data Type
		// Date Range
		// Keyboard
		// Mouse
		// Hard-disk
		// Network
		// Power
		
		//declare
		int num1, num2, num3;
		try {
			//input, process, output
			System.out.print("Enter first no : ");
			num1 = Integer.parseInt(new Scanner(System.in).nextLine());
			System.out.print("Enter second no : ");
			num2 = Integer.parseInt(new Scanner(System.in).nextLine());
			num3 = num1 / num2;
			System.out.println("Result : "+num3);
		}
		catch(Exception ex) {
			//error message
			System.out.println("Error : "+ex.getMessage());
		}

	}

}
