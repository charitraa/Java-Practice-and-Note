package week4.day1;

public class ReturnStatement {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x);
		int y = sum(10, 20);
		System.out.println(y);
		y = sum(45, 64);
		System.out.println(y);
	}
	
	public static int sum(int n1, int n2) {
		return n1+n2;
	}

}
