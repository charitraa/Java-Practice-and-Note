package Day3;

import java.util.Scanner;

public class Exercise_1_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        // Show balances after the first three months
        System.out.println("Balances after 1st month: " + (balance * (1 + monthlyInterestRate)));
        System.out.println(
                "Balances after 2nd month: " + (balance * (1 + monthlyInterestRate) * (1 + monthlyInterestRate)));
        System.out.println("Balances after 3rd month: "
                + (balance * (1 + monthlyInterestRate) * (1 + monthlyInterestRate) * (1 + monthlyInterestRate)));
    }

}
