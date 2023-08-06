package Day3;

import java.util.Scanner;

public class Exercise_1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read inputs from user

        System.out.print("Enter the drive letter: "); // Prompt the user to enter the drive letter
        String drive = scanner.nextLine(); // Read the drive letter as a string

        System.out.print("Enter the path: "); // Prompt the user to enter the path
        String path = scanner.nextLine(); // Read the path as a string

        System.out.print("Enter the file name: "); // Prompt the user to enter the file name
        String fileName = scanner.nextLine(); // Read the file name as a string

        System.out.print("Enter the extension: "); // Prompt the user to enter the extension
        String extension = scanner.nextLine(); // Read the extension as a string

        String fullFileName = drive + ":" + path + "\\" + fileName + "." + extension; // Concatenate the inputs to form
                                                                                      // the full file name
        System.out.println("The complete file name is " + fullFileName); // Print the full file name
    }

}
