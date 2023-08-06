package Day3;

import java.util.Scanner;

public class Exercise_1_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a price: $");
        double price = input.nextDouble();

        // Extract the dollars
        int dollars = (int) price;

        // Extract the cents
        int cents = (int) ((price - dollars) * 100 + 0.5);

        // Print the dollars and cents
        System.out.println("Dollars: $" + dollars);
        System.out.println("Cents: " + cents);
    }

}
