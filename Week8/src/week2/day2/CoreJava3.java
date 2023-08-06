package week2.day2;

public class CoreJava3 {

	public static void main(String[] args) {
		//data types
		//1. Primitive type -> variable
		// boolean, char, byte, short, int, long, float, double
		
		//2. Reference type -> object
		// Array, Class, String
		
		//declare
		int sum;
		double avg;
		int nums[]; //declare an array
		nums= new int[5]; //initialize an array -> memory allocation
		
		//0-4 index range
		//<0; >4 - index out of range error
		
		//input
		nums[0]=6; //value assign
		nums[1]=9;
		nums[2]=8;
		nums[3]=2;
		nums[4]=14;
		//System.out.println(nums[0]);//6
		nums[0]=90;
		//System.out.println(nums[0]);//90
		
		//processing (calculate sum and avg)
		sum = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		avg = sum/5;
		
		//output
		//CW-1
		//Print sum of numbers (nums)
		System.out.println("Sum : "+sum);
		//Print average of numbers (nums)
		System.out.println("Avg : "+avg);
		
		//Note:
			//declare
			//input
			//process
			//output
		
		//CW-2
		//Accept three names from user (keyboard) 
		// and display (by using array).
		
	}
}
