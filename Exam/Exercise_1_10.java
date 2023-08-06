package Day3;

import java.util.Scanner;

public class Exercise_1_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read inputs from user

        System.out.print("Please enter an integer between 1,000 and 999,999: "); // Prompt the user to enter an integer
                                                                                 // with comma
        String input = scanner.nextLine(); // Read the input as a string

        int length = input.length(); // Get the length of the input string
        String firstPart = input.substring(0, length - 4); // Extract the first part of the input without comma
        String lastPart = input.substring(length - 3); // Extract the last part of the input without comma

        String output = firstPart + lastPart; // Concatenate the two parts to form the final output
        System.out.println(output); // Print the final output
    }

}
