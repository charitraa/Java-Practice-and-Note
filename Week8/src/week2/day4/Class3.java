package week2.day4;

public class Class3 {
	
	int num1;
	public Class3() {//default constructor
		this.num1=0;
	}
	public Class3(int num1) { //parameterized constructor
		this.num1=num1;
	}
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public int getNum1() {
		return this.num1;
	}
	public String toString() {
		return this.num1+"";
	}
}
