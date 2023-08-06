package Day3;

import java.util.Scanner;

public class Example_3_2 {
    public static void main(String[] args) {
        System.out.print("Enter the number of square meters: ");
        Double sq = new Scanner(System.in).nextDouble(); // input number of square meters as a double
        double sqKilometers = sq / 1000000; // convert to square kilometers
        System.out.println("Result (println): " + sqKilometers + " km^2"); // output result using println
        System.out.printf("Result (printf):\n", sqKilometers); // output result using printf with 6 decimal
    }
}
