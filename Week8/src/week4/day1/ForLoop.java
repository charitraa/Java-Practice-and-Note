package week4.day1;

public class ForLoop {

	public static void main(String[] args) {
		//Example-1
		/*
		int start=1;
		int stop=10;
		for(; start<=stop; start+=1) {
			System.out.print(start+" ");
		}
		*/
		
		//Example-2
		// start+=1; start++
		/*
		for(int start=1; start<=10; start++) {
			System.out.print(start+" ");
		}
		*/
		//Example-3 Print 1 to 10
		/*
		for(int i=0; i<=10; i++) {
			System.out.println(i+" ");
		}
		*/
		
		//Example-4 Print 10 to 1
		/*
		for(int i=10; i>=1; i--) {
			System.out.println(i+" ");
		}
		*/
		
		//Example-5 Print sum of 1 to 10
		/*
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i; //sum = sum+i
		}
		System.out.println(sum);
		*/
		
		//Example-6 Print factorial of 10.
		//1*2*3...*10
		/*
		int fact =1;
		for(int i=1; i<=10; i++) {
			fact*=i;
		}
		System.out.println(fact);
		*/
		
		
		//Nested Loop
		/*
		//i loop
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		//j loop
		for(int j=1; j<=5; j++) {
			System.out.print(j);
		}
		*/
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			for(int j=1; j<=5; j++) {
				System.out.println(j);
			}
		}
		*/
		
		//For Loop with Array
		/*
		int nums[]= {8,6,9,7,10};
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
			System.out.print(nums[i]+" ");
		}
		System.out.println("SUM : "+sum);
		*/
		
		
		
		
		
	}
}