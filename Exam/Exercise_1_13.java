package Day3;

import java.util.Scanner;

public class Exercise_1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer with no more than five digits: ");
        int num = scanner.nextInt();

        // Calculate the first digit
        int firstDigit = num / 10000;
        System.out.print(firstDigit + " ");

        // Calculate the second digit
        int secondDigit = (num % 10000) / 1000;
        System.out.print(secondDigit + " ");

        // Calculate the third digit
        int thirdDigit = (num % 1000) / 100;
        System.out.print(thirdDigit + " ");

        // Calculate the fourth digit
        int fourthDigit = (num % 100) / 10;
        System.out.print(fourthDigit + " ");

        // Calculate the fifth digit
        int fifthDigit = num % 10;
        System.out.print(fifthDigit);
    }

}
