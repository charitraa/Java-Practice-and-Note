package Day3;

public class SecretClass {
    static final double PI = 3.141592653589793;
    public static void main(String[] args){

    /**
    The purpose of main method is the starting point from where compiler starts program execution.
    So, the compiler needs to call the main() method. If the main() is allowed to be non-static,
    then while calling the main() method JVM has to instantiate its class.
    */
        System.out.println("Java is cool!");  //Prints a string literal

        System.out.println(2 + 3);  //Prints the result of 2 + 3, which is 5

        System.out.println("2" + (2 + 2));  //Prints "24", the result of concatenating the string "2" and the result of 2 + 2

        String str = "PI = ";  //Declares a string variable and assigns it the value "PI = "
        System.out.println(str + PI);  //Prints the result of concatenating the string variable and the value of PI

        double piSquare = PI * PI;  //Calculates the square of PI and assigns it to the variable piSquare
        System.out.println("The square of PI is " + piSquare);  //Prints the result of the square of PI

        double fakePI = piSquare/2;  //Divides the value of piSquare by 2 and assigns the result to the variable fakePI
        boolean checkPI = (PI == fakePI);  //Compares the value of PI and fakePI, and assigns the result of the comparison to the variable checkPI
        System.out.println("PI and the fake PI are equal. " +  " This statement is " + checkPI + ".");  //Prints the comparison result of PI and fakePI

        fakePI = 3.141592653589793;  //Assigns the value of 3.141592653589793 to the variable fakePI
        checkPI = (PI == fakePI);  //Compares the value of PI and fakePI, and assigns the result of the comparison to the variable checkPI
        System.out.println("PI and the fake PI are equal. " +  " Now this statement is " + checkPI + ".");  //Prints the comparison result of PI and fakePI

        System.out.println("Hussain".equals("Fred"));  //Compares the values of two string literals and prints the result of the comparison
    }
}

