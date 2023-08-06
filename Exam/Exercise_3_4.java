package Day3;

import java.util.Scanner;

public class Exercise_3_4 {
    public static void main(String[] args) {
        // calling scanner function
        Scanner sc = new Scanner(System.in);
        // input first mark
        System.out.print("Enter the first mark: ");
        double firstMark = sc.nextDouble();
        // input second mark
        System.out.print("Enter the second mark: ");
        double secondMark = sc.nextDouble();
        System.out.print("Enter the third mark: ");
        // input third mark
        double thirdMark = sc.nextDouble();
        // calculate average
        double average = ((firstMark + secondMark + thirdMark) / 3);
        System.out.println("The marks are: " + firstMark + ", " + secondMark + ", " + thirdMark);
        System.out.println("The average mark is: " + average + "\n");
        sc.close();
        if (average >= 40) {
            System.out.println("You have passed\n");
        } else {
            System.out.println("You have failed\n");

        }
    }
}