package week3.day2;

public class Class2 {
	private int num1; // instance variables
	private int num2;
	// add default constructor
	public Class2() {
		this.num1 = 0;
		this.num2=0;
	}
	public Class2(int num1, int num2) { // parameterized constructor
		this.num1 = num1;
		this.num2=num2;
	}
	//Getter
	public int getNum1() {
		return this.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	//Setter
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	// add toString method
	public String toString() {
		return this.num1 + " "+this.num2;
	}
}
