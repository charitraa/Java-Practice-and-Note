
package Day3;

import java.util.Scanner;

public class Exercise_1_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        // Read the resistance of the first resistor
        System.out.print("Enter the resistance of the first resistor: ");
        double r1 = sc.nextDouble();

        // Read the resistance of the second resistor
        System.out.print("Enter the resistance of the second resistor: ");
        double r2 = sc.nextDouble();

        // Read the resistance of the third resistor
        System.out.print("Enter the resistance of the third resistor: ");
        double r3 = sc.nextDouble();

        // Compute the total resistance using Ohm's law
        double totalResistance = r1 + r2 + r3;

        // Print the total resistance
        System.out.println("The total resistance is: " + totalResistance + " Ohms");
    }

}
