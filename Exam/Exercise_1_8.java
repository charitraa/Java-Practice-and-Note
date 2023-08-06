package Day3;

import java.util.Scanner;

public class Exercise_1_8 {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of gallons of gas in the tank
        System.out.print("Enter the number of gallons of gas in the tank: ");
        double gallonsOfGas = scanner.nextDouble();

        // Prompt the user to enter the fuel efficiency in miles per gallon
        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        double fuelEfficiency = scanner.nextDouble();

        // Prompt the user to enter the price of gas per gallon
        System.out.print("Enter the price of gas per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // Calculate the cost per 100 miles
        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;

        // Calculate how far the car can go with the gas in the tank
        double distance = fuelEfficiency * gallonsOfGas;

        // Print the result
        System.out.println("The cost per 100 miles is " + costPer100Miles);
        System.out.println("The car can go " + distance + " miles with the gas in the tank.");
    }

}
