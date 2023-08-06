package assigment;
/*Write a program that reads a number between 1,000 and 999,999 from
the user, where the user enters a comma in the input. Then print the
number without a comma. Here is a sample dialog:
Please enter an integer between 1,000 and 999,999: 23,456
23456
Hint: Read the input as a string. Measure the length of the string.
Suppose it contains n characters. Then extract substrings consisting of
the first n – 4 characters and the last three characters.*/
import java.util.Scanner;
public class Ex10 {
public static void main(String []args) {
	Scanner aec= new Scanner(System.in);
	System.out.println("enter aa number between 1000 and 999999");
	String num=aec.nextLine();
	
	String sun= num.replace(",","");
	System.out.println(sun);
	
}
}
