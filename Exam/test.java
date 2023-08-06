package saparsha;

public class test {

    private int num1;// instance variable
    // constructor

    public test() {
        this.num1 = 0;
    }

    public test(int num1) {
        this.num1 = num1;
    }

    // getter
    public int getNum1() {
        return this.num1;
    }

    // setter
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // toString
    public String toString() {
        return this.num1 + "";

    }
}
