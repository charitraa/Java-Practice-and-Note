package week4.day4;
import java.util.Scanner;
public class MyCalculator2 {

	public static void main(String[] args) {
		//Declare
		int choice=0;
		final int MIN=0;
		final int MAX=1;
		int num1=0, num2=0, result=0;
		
		//Input
		System.out.println("Main Menu");
		System.out.println("1. ADD");
		System.out.println("2. SUB");
		System.out.println("3. PRD");
		System.out.println("4. DIV");
		System.out.println("0. Exit");
		System.out.print("Enter your choice  : ");
		choice = Integer.parseInt(new Scanner(System.in).nextLine());
		//Process
		if((choice>=MIN) && (choice<=MAX)) {
			//System.out.println("Your choice : "+choice);
			if(choice==1) {//Add
				//read two numbers from user
				System.out.print("Enter first no : ");
				num1 = Integer.parseInt(new Scanner(System.in).nextLine());
				System.out.print("Enter second no : ");
				num2 = Integer.parseInt(new Scanner(System.in).nextLine());
				//calculate sum
				result = num1+num2;
				//print sum
				System.out.println("SUM : "+result);
			}
			else if(choice==0) {
				//Exit the program
			}
		}
		else {
			System.out.println("out of range");
		}
		//Output
	}
}
