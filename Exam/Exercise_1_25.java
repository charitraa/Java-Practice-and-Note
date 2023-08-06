package Day3;

import java.util.Scanner;

public class Exercise_1_25 {
    public static void main(String[] args) {
        // create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // prompt the user to enter the relative humidity
        System.out.print("Enter relative humidity (0 to 1): ");
        double rh = scan.nextDouble();

        // prompt the user to enter the temperature
        System.out.print("Enter temperature (in C): ");
        double temp = scan.nextDouble();

        // close the Scanner object
        scan.close();

        // calculate the dew point using the formula
        double b = 17.62;
        double c = 243.12;
        double gamma = Math.log(rh) + b * temp / (c + temp);
        double dewPoint = c * gamma / (b - gamma);

        // print the dew point
        System.out.println("Dew point: " + dewPoint + " C");
    }

}
