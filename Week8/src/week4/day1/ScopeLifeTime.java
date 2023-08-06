package week4.day1;

public class ScopeLifeTime {

	public static void main(String[] args) {
		int x=10;
		System.out.println(x);
		f1(x);
		System.out.println(x);
	}
	
	public static void f1(int x) {
		x+=2; //modify x (increase by 2)
		System.out.println(x);
	}

}
