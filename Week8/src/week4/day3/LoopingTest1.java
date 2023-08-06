package week4.day3;
import java.util.Scanner;

public class LoopingTest1 {

	public static void main(String[] args) {
		//Lab-1. Print 1 to 10
		/*
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		*/
		
		//Lab-2. Print 10 to 1
		/*
		for(int i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		*/
		
		
		//Lab-3. Print sum of 1 to 10.
		/*
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i; //sum = sum+i
		}
		System.out.println("Sum : "+sum);
		System.out.println("Average: "+sum/10);
		*/
		
		//Lab-4. Print factorial of 5.
		/*
		int fact=1;
		for(int i=1; i<=5; i++) {
			fact*=i; //fact=fact*i
		}
		System.out.println("Factorial: "+fact);
		*/
		
		//Array and Looping
		//Lab-5. accept input from user for 5 elements.
		/*
		final int MAX = 5;
		int nums[]=new int[MAX];
		//reading values from user using loop
		for(int i=0; i<nums.length; i++) {
			System.out.print("Enter any number : ");
			nums[i]=Integer.parseInt(new Scanner(System.in).nextLine());
		}
		*/
		
		int nums[]= {6,7,8,2,3};
		//Lab-6. Print elements of an array
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		//Lab-7. Print max element of an array
		int max = nums[0]; //6
		for(int i=1; i<nums.length; i++) {
			if (max<nums[i])
				max=nums[i];
		}
		System.out.println("MAX : "+max);
		
		//Lab-9. Print min element of an array
		int min=nums[0];
		for(int i=1; i<nums.length; i++) {
			if(min>nums[i])
				min=nums[i];
		}
		System.out.println("MIN : "+min);
		
		//Lab-10. Search a number in array
		int num1 = 80;
		boolean result=false;
		for(int i=0; i<nums.length; i++) {
			if(num1 == nums[i]) {
				result=true;
				break;
			}
		}
		if(result==true)
			System.out.print("found ");
		else
			System.out.print("not found ");
		System.out.println();
		
		//Lab-11. Print array with ascending order
		// int nums[]= {6,7,8,2,3}; //6 7 2 3 8 
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]>nums[i+1]) {
				//swap
				int tmp = nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=tmp;
			}
		}
		//Print array elements
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		//Lab-12. Print array with descending order
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
