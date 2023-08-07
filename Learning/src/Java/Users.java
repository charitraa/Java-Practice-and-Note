package Java;
import java.util.Scanner;
public class Users{
	public static void main(String[]args) {
		String x, y ;
		Scanner name = new Scanner(System.in);
		System.out.print("Enter your name: ");
		x = name.nextLine();
		System.out.print("Enter your last name: ");
		y = name.nextLine();
		System.out.println("Name: "+x+y);
		name.close();
	}
}
