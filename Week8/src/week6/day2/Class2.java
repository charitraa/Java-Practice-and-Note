package week6.day2;

public class Class2 extends Class1{
	int num2;
	public Class2() {
		super.num1=0;
		this.num2=0;
	}
	public Class2(int num1, int num2) {
		super(num1);
		this.num2=num2;
	}
	//getters
	
	@Override
	public int getNum1() {
		return super.num1;
	}
	public int getNum2() {
		return this.num2;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	@Override
	public String toString() {
		return super.num1+", "+this.num2;
	}
}
