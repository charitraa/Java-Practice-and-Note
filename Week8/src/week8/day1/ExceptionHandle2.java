package week8.day1;

import java.util.Scanner;

public class ExceptionHandle2 {

	public static void main(String[] args) {
		
		int num1;
		try {
			System.out.println("In");
			System.out.print("Enter first no : ");
			num1 = Integer.parseInt(new Scanner(System.in).nextLine()); //range 1-30
			if(num1>=30) {
				throw new LargeValue("Value out of range - large");
			}
			else if(num1<=0) {
				throw new SmallValue("Value out of range - small");
			}
			else {
				System.out.println("Value : "+num1+" in range");
			}
		}
		catch(LargeValue ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		catch(SmallValue ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		finally {
			System.out.println("Out");
		}

	}

}
