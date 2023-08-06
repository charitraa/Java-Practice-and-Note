package Day3;

import java.util.Scanner;

public class Exercise_1_5 {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        // Prompt the user to enter a measurement in metres
        System.out.print("Enter a measurement in metres: ");
        double metres = scanner.nextDouble();

        // Convert the measurement from metres to miles
        double miles = metres * 0.000621371;

        // Convert the measurement from metres to feet
        double feet = metres * 3.28084;

        // Convert the measurement from feet to inches
        double inches = feet * 12;

        // Print the results
        System.out.println(metres + " metres is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }

}
