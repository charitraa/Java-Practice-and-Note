package Day3;

import java.util.Scanner;

public class Exercise_1_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // prompt the user to enter a number between 1 and 12
        System.out.print("Enter a number between 1 and 12: ");
        int monthNum = scan.nextInt();

        String monthName;
        // use switch statement to match the input number to the corresponding month
        // name
        switch (monthNum) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            // handle the case of an invalid input
            default:
                monthName = "Invalid month";
        }

        // print the result
        System.out.println("The month name is: " + monthName);
    }

}
