package week4.day4;

public class LoopingTest3 {

	public static void main(String[] args) {
		//Task-1. Declare and initialize an array with 5 elements.
		final int MAX = 5;
		int nums[]=new int[MAX];
		nums[0]=9;
		nums[1]=10;
		nums[2]=7;
		nums[3]=6;
		nums[4]=2;
		
		//int nums[]={9,10,7,6,2};
		
		//Task-2. Print all the elements of an array.
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		
		//Task-3. Calculate and print the sum of an array elements.
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+sum/nums.length);
		
		//Task-4. Print the max element of an array
		int max=nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i]>max)
				max=nums[i];
		}
		System.out.println("Max : "+max);
		
		//Task-5. Print the min element of an array
		int min = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i]<min)
				min=nums[i];
		}
		System.out.println("Min Value: "+min);
		
		//Task-6. Search the number in an array.
		int num=5;//read number from user.
		boolean result = false;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]==num) {
				result=true;
				break;
			}
		}
		if(result==false)
			System.out.println(num+" not found");
		else
			System.out.println(num+" found");
		
		//Task-7. Sorting elements of an array - ASC
		//{9, 10, 7, 6, 2}; //source
		for(int i=0; i<nums.length; i++) {
			for(int j=1; j<nums.length; j++) {
				if(nums[i]>nums[j]) {//swap
					int tmp = nums[i];
					nums[i]=nums[j];
					nums[j]=tmp;
				}
					
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		
		
		
		

	}

}
