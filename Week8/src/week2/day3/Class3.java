package week2.day3;

public class Class3 {
	int num1;
	int num2;
	int num3;
	
	public String toString() {
		return this.num1+", "+this.num2+", "+this.num3;
	}
	public void sum() {
		this.num3=this.num1+this.num2;
	}
	public void sub() {
		this.num3=this.num1-this.num2;
	}
	public void prd() {
		this.num3=this.num1*this.num2;
	}
	public void div() {
		this.num3=this.num1/this.num2;
	}
	public void pow() {
		double n1=this.num1;
		double n2=this.num2;
		this.num3=(int) Math.pow(n1, n2);
	}
}
