package Day3;

import java.util.Scanner;

public class Exercise_1_11 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter a number between 1000 and 999999
        System.out.print("Please enter an integer between 1000 and 999999: ");
        // Read the number from the user
        int num = scanner.nextInt();

        // Check if the number is within the specified range
        if (num >= 1000 && num <= 999999) {
            // If the number is within the specified range, format it with a comma separator
            String formatted = String.format("%,d", num);
            // Print the formatted number
            System.out.println(formatted);
        } else {
            // If the number is not within the specified range, print an error message
            System.out.println("Invalid number. Please enter a number between 1000 and 999999.");
        }
    }

}
