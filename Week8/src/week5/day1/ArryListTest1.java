package week5.day1;

import java.util.ArrayList;

public class ArryListTest1 {

	public static void main(String[] args) {
		/*
		// Array - an object which can hold multiple values of similar type
		int nums[]=new int[5]; //five values of int type
		
		//Assign the values
		nums[0]=9;
		nums[1]=7;
		nums[2]=8;
		nums[3]=5;
		nums[4]=10;
		
		//Accessing the value
		System.out.println(nums[0]); //Accessing the first value
		
		//Updating the value value
		nums[2]=15;
		System.out.println(nums[2]); //Accessing the value
		
		//Out of the bounds
		// nums[-1]=9; //ArrayIndexOutOfBoundException
		// nums[5]=23; //ArrayIndexOutOfBoundException		
		
		*/
		
		// ArrayList - Library Class/API in Java
		// java.util.ArrayList - Package and Class
		// ArrayList is Collection Class of Java - it stores any type of any number of values
		
		//Array
		// can store multiple values of similar type
		
		//ArrayList
		// can store multiple values of any types
		
		//How to create an object of an ArrayList Class?
		//1. Import Class (Import Library) ()
		// import java.util.ArrayList
		
		//2. Declare an object of class
		//ArrayList aList = new ArrayList();
		
		//3. Adding value on ArrayList object
		// boolean	add(E e)
		/*
		boolean result = aList.add(45); //0 index
		System.out.println(result);
		result = aList.add(50); //1 index
		System.out.println(result);
		result = aList.add(65); //2 index
		System.out.println(result);		
		System.out.println(aList); //[45, 50, 65]
		*/
		
		//Task-1
		//Create an object of ArrayList Class and add your 
		// personal info (sid, name, address, email, and mobile) on it.
		/*
		ArrayList s1 = new ArrayList(); //declare and initialize an object of arraylist
		s1.add(123); //add item
		s1.add("Aryam Bajracharya");
		s1.add("Lalitpur");
		s1.add("aryam@gmail.com");
		s1.add(98543234);
		System.out.println(s1); //access all the items
		*/
		
		//4. Clearing all the contents
		// void	clear()
		/*
		ArrayList aList = new ArrayList();
		aList.add(8); //0
		aList.add(21); //1
		aList.add(88); //2
		System.out.println(aList); //[8, 21, 88]
		aList.clear(); //removes all the elements from arraylist
		System.out.println(aList);
		*/
		
		//5. Getting an element
		//E	get(int index)
		/*
		ArrayList aList = new ArrayList();
		aList.add(56); //0
		aList.add(85); //1
		aList.add(74); //2
		aList.add(52); //3
		System.out.println(aList); //all the elements
		Object obj1 = aList.get(1);
		System.out.println(obj1);
		*/
		
		//6. Remove an element
		// E	remove(int index)
		/*
		ArrayList aList = new ArrayList();
		aList.add(5); //0
		aList.add(7);
		aList.add(10); //remove the value
		aList.add(1);
		aList.add(9); //4
		System.out.println(aList);
		aList.remove(2); //remove the value of index 2
		System.out.println(aList);
		*/
		
		// 7. Update/Edit/Change an item
		// E	set(int index, E element)
		/*
		ArrayList aList = new ArrayList();
		aList.add(5);
		aList.add(1);
		aList.add(8); // 8 to 87
		aList.add(9);
		aList.add(23);
		System.out.println(aList);
		Object obj1 = aList.set(2, 87);
		System.out.println(obj1);
		System.out.println(aList);
		*/
		
		//8. Size of ArrayList (Number of Values)
		// int	size()
		/*
		ArrayList aList = new ArrayList();
		aList.add(5);
		aList.add(8);
		aList.add(10);
		aList.add(2);
		aList.add(7);
		int len = aList.size();
		System.out.println(len);
		*/
		
		//Task-2
		/*
		a. Create an object of ArrayList.
		b. Add five elements (8,4,3,8,6)
		c. Print the size of an ArrayList.
		d. Update value 3 by 9
		e. Print the value of index 2
		f. Remove the  value 6
		g. Clear the ArrayList
		*/
		
		//Task-3
		//How to store an object of other class in ArrayList?
		/*
		Person
		Student
		Pen
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
