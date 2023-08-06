package week4.day1;
public class DoWhileLoop {
	public static void main(String[] args) {
		//loop design (start, stop, statement, condition, modifier
		int start=100;
		int stop=10;
		do {
			System.out.println(start);
			start+=1;
		}while(start<=stop);
	}
}
