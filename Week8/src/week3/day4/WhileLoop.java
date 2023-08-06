package week3.day4;
import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//print PCPS College 5 times.
		/*
		System.out.println("PCPS College");
		System.out.println("PCPS College");
		System.out.println("PCPS College");
		System.out.println("PCPS College");
		System.out.println("PCPS College");
		*/
		//Loop Design
		/*
		start : 1
		stop  : 5
		condition: 1<=5
		statement: print("PCPS College")
		modifier: ++, -- (increment/decrement)
		 */
		//byte start=1;
		//byte stop=5;
		//System.out.println("PCPS College");
		//start<=stop;
		//start+=1;
		
		//Example-1 print PCPS College 5 times.
		/*
		byte start=1; //start
		byte stop = 5; //stop
		while(start<=stop) { //condition
			System.out.println("PCPS College"); //statement
			start+=1; //modifier
		}
		*/
		
		//Example-2 print 1 to 10.
		/*
		byte start=1;
		byte stop=10;
		System.out.print("Enter start number : ");
		//start = read number from user.
		System.out.print("Enter stop number : ");
		//stop = read number from user i.e. keyboard
		while(start<=stop) {
			System.out.print(start+" ");
			start+=1;
		}
		System.out.println();
		*/
		
	// Example-3
	/*
	final int MAX = 5;
	int nums[] = new int[MAX]; //declare
	nums[0]=7; //assign
	nums[1]=8;
	nums[2]=6;
	nums[3]=5;
	nums[4]=9;
	int start=0; //start
	int stop=4; //stop
	while(start<=stop) { //condition
		System.out.println(nums[start]); //access
		start+=1;//modifier
	}
	*/
		
	//Example-4
	/*
	int tmpInt;
	final int MAX = 5;
	int nums[]=new int[MAX];
	int start = 0;
	while(start<MAX) {
		System.out.print("Enter any number : "); //prompt for user
		String tmpStr = new Scanner(System.in).nextLine(); //read string from keyboard
		tmpInt = Integer.parseInt(tmpStr); // String to int
		nums[start]=tmpInt;
		start+=1;
	}
	*/
		
	//Example-5 Calculate the sum of array elements
	/*
	int nums [] = {5,6,2,3,7}; //declare and initialize array	
	//System.out.println(nums.length);
	int start=0;
	int stop=nums.length;
	int sum=0;
	while(start<stop) {
		//System.out.print(nums[start]+" ");
		sum+=nums[start];
		start+=1;
	}
	System.out.println(sum);
	*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
