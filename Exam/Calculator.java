package Day2;

public class Calculator {
    int num1, num2, num3;

    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
        this.num3 = 0;
    }

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = 0;
    }

    // getters
    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public int getNum3() {
        return this.num3;
    }

    // Setters
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Methods
    public void sum() {
        this.num3 = this.num1 + this.num2;
    }

    public String toString() {
        return this.num1 + ", " + this.num2 + ", " + this.num3;

    }
}
