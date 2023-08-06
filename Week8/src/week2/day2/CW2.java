package week2.day2;
import java.util.Scanner;

public class CW2 {
	public static void main(String []args) {
		//read three names from user and display using array.
		
		//declare
		int MAX = 3; //declare and initialize
		String names[]; //declare an array
		names=new String[MAX]; //initialize an array

		//input
		System.out.print("Enter first name : "); //prompt for user
		names[0]=new Scanner(System.in).nextLine();
		
		System.out.print("Enter first name : "); //prompt for user
		names[1]=new Scanner(System.in).nextLine();
		
		System.out.print("Enter first name : "); //prompt for user
		names[2]=new Scanner(System.in).nextLine();
		
		//process
		//output
		System.out.println("First name "+names[0]);
		System.out.println("Second name "+names[1]);
		System.out.println("Third name "+names[2]);
		
	}
}
