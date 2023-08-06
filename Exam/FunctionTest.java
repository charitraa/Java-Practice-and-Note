package Day1;

import java.util.Scanner;

public class FunctionTest {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int z = 0;
		System.out.println("enter first no: ");
		x = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.println("enter Second no: ");
		y = Integer.parseInt(new Scanner(System.in).nextLine());
		z = sum(x, y);
		System.out.println("Result:" + z);

	}

	public static int sum(int a, int b) {
		return a + b;
	}

}
