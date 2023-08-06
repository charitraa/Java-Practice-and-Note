
package Day1;
import java.util.Scanner;
public class Calculator3 {
	public static void main(String[] args)  {
	System.out.print("Enter your name:");
	Scanner name = new Scanner(System.in);
	String first = name.nextLine();
	System.out.print("Enter your last_name:");
	String last = name.nextLine();
    System.out.println("Name : "+first);
	System.out.println("last_name : "+last);
	name.close();
}
    }