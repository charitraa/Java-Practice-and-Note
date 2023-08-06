package week4.day1;

public class FunctionsOverview {
	
	public static void main(String []args) {
		hello();//calling
		hello();
		hello();
		print("Hi");
		String str1 = "PCPS";
		print(str1);	
		int x = result();
		
		
	}
	public static int result2(int x, int y) {
		return x+y;
	}
	public static int result() {
		return 20+30;
	}
	
	public static void print(String message) {
		System.out.print(message);
	}
	public static void hello() {
		System.out.println("Hello how are you?");
	}
}
