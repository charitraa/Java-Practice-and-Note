package week5.day2;
import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		int num=9;
		System.out.println(num);
		num=23;
		System.out.println(num);
		
		
		int nums[]= {5,7,1,9,3};
		
		//Declare an object
		ArrayList aList = new ArrayList();
		
		//boolean	add(E e)
		boolean result = aList.add(34);
		System.out.println(result);
		System.out.println(aList); //all values
		System.out.println(aList.get(0));
		aList.set(0, 45);
		System.out.println(aList); //all values
		aList.remove(0); //delete
		System.out.println(aList); //all values
	}
}
