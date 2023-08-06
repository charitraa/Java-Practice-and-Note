package week3.day3;
import java.util.Scanner;

public class Day3Example1 {

	public static void main(String[] args) {
		//basic types (boolean, char, byte, short, int, long, float, double)
		//Ref types (Object, String, Class, Interface, Array, Enum)
		
		// Operators
		//Assignment, Arithmetic, Relational, Logical
		//Arithmetic +, -, *, /, %, sqrt, pow
		
		//Relational ==, !=, >, >=, <, <=
		// Compare two values and return boolean result
		//Examples
		/*
		System.out.println(10==10);
		System.out.println(10!=10);
		System.out.println(10>5);
		System.out.println(10>=10);
		System.out.println(10<50);
		System.out.println(10<=10);
		
		boolean result = (10==10);
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		System.out.println(result);
		*/
		
		//Example-2 - if statement
		/*
		int num1, num2;//declare (default 0)
		boolean result; //declare (default false)
		num1=45; //assign
		num2=54;
		result = (num1==num2); //compare and assign
		System.out.println(result); //access
		if(result==true) //compare
			System.out.println("Equals");//print
		*/
		
		//Example-3 if statement
		/*
		int num1, num2;
		boolean result;
		num1 = 5;
		num2 = 5;
		result = (num1 == num2);
		if(result==true) // if result is equals to true
			System.out.println("Equals");
		if(result==false) // if result is equals to false
			System.out.println("Not Equals");
		*/
		
		//Example-4 if statement with multiple statements
		/*
		boolean result = true;
		if(result==true) {
			System.out.println("Hello");
			System.out.println("Hi");
		}
		System.out.println("Welcome");
		*/
		
		//Example-5
		/*
		int num1, num2;
		boolean result;
		System.out.print("Enter first no : ");
		num1 = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter second no : ");
		num2 = Integer.parseInt(new Scanner(System.in).nextLine());
		result = (num1 == num2);
		if(result) {//result equals to true
			System.out.println("Eqauls");
		}
		if(!result) {//result not equals to true
			System.out.println("Not Eqauls");
		}
		*/
		
		//Example-6 if ... else statement
		/*
		int num1=9;
		int num2=10;
		boolean result=false;
		result = (num1==num2);
		//if(num1==num2){
		if(result) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equals");
		}
		*/
		
		//Example-7 elseif statement
		/*
		int num1=1;//accept input from user
		if(num1==1) {
			System.out.println("SUN");
		}
		else if(num1==2) {
			System.out.println("MON");
		}
		else {
			System.out.println("OTHERS");
		}
		*/
		
		//Example-8 nested if statement
		/*
		int num1=13;
		int num2=7;
		int num3=18;
		if(num1>num2) //outer if
			if(num1>num3) //inner if
				System.out.println(num1);
		*/
		
		//Example-9 if statement with multiple conditions
		int num1=9;
		int num2=10;
		int num3=7;
		if((num1>num2) && (num1>num3))
			System.out.println(num1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
