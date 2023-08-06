package Day3;

import java.util.Scanner;

public class Exercise_1_4 {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        // Prompt the user to enter the first integer
        System.out.print("Enter first integer: ");
        int first = scanner.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter second integer: ");
        int second = scanner.nextInt();

        // Calculate the sum of the two integers
        int sum = first + second;

        // Calculate the difference of the two integers
        int difference = first - second;

        // Calculate the product of the two integers
        int product = first * second;

        // Calculate the average of the two integers
        double average = (double) (first + second) / 2;

        // Calculate the absolute difference of the two integers
        int distance = Math.abs(difference);

        // Find the maximum of the two integers
        int maximum = Math.max(first, second);

        // Find the minimum of the two integers
        int minimum = Math.min(first, second);

        // Print the results
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The average is " + average);
        System.out.println("The distance is " + distance);
        System.out.println("The maximum is " + maximum);
        System.out.println("The minimum is " + minimum);
    }

}
