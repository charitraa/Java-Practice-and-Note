package week9.day3;

public class Test2 {
	public static void f1() {
		int x,y,z;
		x=9;
		y=8;
		z=x+y;
		System.out.println(z);
	}
	public static void f2() {
		int x,y,z;
		x=98;
		y=85;
		z=x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		f1();
		f2();
		f1();
	}
}
