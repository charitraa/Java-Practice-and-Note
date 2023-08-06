package Day3;

import java.util.Scanner;

public class Exercise_1_7 {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the cost of a new car
        System.out.print("Enter the cost of a new car: ");
        double newCarCost = scanner.nextDouble();

        // Prompt the user to enter the estimated miles driven per year
        System.out.print("Enter the estimated miles driven per year: ");
        double milesPerYear = scanner.nextDouble();

        // Prompt the user to enter the estimated petrol price
        System.out.print("Enter the estimated petrol price: ");
        double petrolPrice = scanner.nextDouble();

        // Prompt the user to enter the efficiency in miles per gallon
        System.out.print("Enter the efficiency in miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        // Prompt the user to enter the estimated resale value after 5 years
        System.out.print("Enter the estimated resale value after 5 years: ");
        double resaleValue = scanner.nextDouble();

        // Calculate the total fuel cost
        double totalFuelCost = (milesPerYear / milesPerGallon) * petrolPrice * 5;

        // Calculate the total cost of owning the car for 5 years
        double totalCost = newCarCost + totalFuelCost - resaleValue;

        // Print the result
        System.out.println("The total cost of owning the car for 5 years is " + totalCost);
    }

}
