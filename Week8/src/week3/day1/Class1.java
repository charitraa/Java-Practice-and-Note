package week3.day1;

public class Class1 {
	int num1;
	int num2;
	public Class1(int num1, int num2) {//Parameterized constructor
		this.num1=num1;
		this.num2=num2;
	}
	public Class1() {//Default Constructor
		//objective of constructor, //new -> memory allocation //initialize the instance variable
		this.num1 = 0;
		this.num2 = 0;
	}
}
