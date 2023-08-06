package day2;
public class CoreJava {
	public static void main(String[]args) { 
		
		int nums[];//declare an array
		
		nums=new int[5];// initialize an array -> memory allocation
		//0-4 index range
		//<0; >4 - index out of range error
		nums[0]=6;
		nums[1]=9;
		nums[2]=8;
		nums[3]=2;
		nums[4]=14;
		System.out.println(nums[0]);
		//nums[0]=90;
		//System.out.println(nums[0]);
		int sum = nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		System.out.println("Sum of all Arrays: "+sum);
		
		
		double average= sum/5;
		
		
		System.out.println("Average of arrays: "+average);
		
		
		System.out.println();
		
		
		
	}
}
