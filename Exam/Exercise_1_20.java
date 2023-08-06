package Day3;

import java.util.Scanner;

public class Exercise_1_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 10-digit phone number: ");
        String phoneNumber = input.nextLine();

        // Extract the area code
        String areaCode = "(" + phoneNumber.substring(0, 3) + ") ";

        // Extract the remaining part of the phone number
        String remainingNumber = phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);

        // Concatenate the area code and remaining number to get the formatted number
        String formattedNumber = areaCode + remainingNumber;

        // Print the formatted number
        System.out.println("Formatted number: " + formattedNumber);
    }

}
