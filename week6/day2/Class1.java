package week6.day2;
//OOP

//Container of instance variable and methods
public class Class1 {
	int num1;
	public Class1() {
		this.num1=0; //default value
	}
	public Class1(int num1) {
		this.num1=num1;
	}
	//getters
	public int getNum1() {
		return this.num1;
	}
	//setters
	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	@Override
	public String toString() {
		return this.num1+"";
	}
}
