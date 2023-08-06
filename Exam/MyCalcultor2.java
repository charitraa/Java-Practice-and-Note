package Day3;

import java.util.Scanner;

public class MyCalcultor2 {
    public static void main(String[] args) {
        // declare
        int choice;
        // input
        System.out.println("Main Menu");
        System.out.println("1.Add");
        System.out.println("2.SUB");
        System.out.println("3.PRO");
        System.out.println("4.DIV");
        System.out.println("0.Exit");
        System.out.print("Enter your choice: ");
        choice = new Scanner(System.in).nextInt();
        System.out.println();
        final int MAX = 4, MIN = 0;
        if ((choice >= MIN) && (choice <= MAX)) {
            if (choice == 1) {
                System.out.print("enter first number:");
                int num1 = new Scanner(System.in).nextInt();
                System.out.println();
                System.out.print("enter second number:");
                int num2 = new Scanner(System.in).nextInt();
                System.out.println();
                int sum = num1 + num2;
                System.out.println("Sum: " + sum);

            } else if (choice == 0) {
                return;
            } else if (choice == 2) {
                System.out.print("enter first number:");
                int num1 = new Scanner(System.in).nextInt();
                System.out.println();
                System.out.print("enter second number:");
                int num2 = new Scanner(System.in).nextInt();
                System.out.println();
                int subtract = num1 - num2;
                System.out.println("Subtract: " + subtract);

            } else if (choice == 3) {
                System.out.print("enter first number:");
                int num1 = new Scanner(System.in).nextInt();
                System.out.println();
                System.out.print("enter second number:");
                int num2 = new Scanner(System.in).nextInt();
                System.out.println();
                int product = num1 * num2;
                System.out.println("Product: " + product);

            } else if (choice == 4) {
                System.out.print("enter first number:");
                int num1 = new Scanner(System.in).nextInt();
                System.out.println();
                System.out.print("enter second number:");
                int num2 = new Scanner(System.in).nextInt();
                System.out.println();
                int divide = num1 / num2;
                System.out.println("Divide: " + divide);

            }
            System.out.println();
            // System.out.println("your choice: " + choice);
        } else {
            System.out.println("out of range");
        }

    }

}
