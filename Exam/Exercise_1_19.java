package Day3;

import java.util.Scanner;

public class Exercise_1_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the total book price: £");
        double totalBookPrice = input.nextDouble();
        System.out.print("Enter the number of books: ");
        int numBooks = input.nextInt();

        // Compute the tax
        double tax = totalBookPrice * 0.075;

        // Compute the shipping charge
        double shippingCharge = numBooks * 2;

        // Compute the total price of the order
        double totalPrice = totalBookPrice + tax + shippingCharge;

        // Print the total price of the order
        System.out.println("The total price of the order is £" + totalPrice);
    }

}
