package Day3;

//Write a program to input one integer, multiply its value by 2 and output the result.
import java.util.Scanner;

public class Exercise3_1 {
    // import the library
    public static void main(String[] args) {
        // input integer from the user
        System.out.print("Enter an integer: ");
        // scan the value
        int sc = new Scanner(System.in).nextInt();
        int result = sc * 2; // multiply by 2
        System.out.println("Result: " + result); // output result

    }

}
