package week3.day2;

public class Class1 {
	int num1; // instance variables
	// add default constructor
	public Class1() {
		this.num1 = 0;
	}
	public Class1(int num1) { // parameterized constructor
		this.num1 = num1;
	}
	// add toString method
	public String toString() {
		return this.num1 + " ";
	}
}
