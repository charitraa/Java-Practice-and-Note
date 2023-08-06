package Day3;

public class Exercise_1_2 {
    public static void main(String[] args) {
        // Define the constant for millimeters per inch
        double MM_PER_INCH = 25.4;

        // Define the width and height of the letter-size sheet in inches
        double widthInches = 8.5;
        double heightInches = 11.0;

        // Calculate the dimensions in millimeters
        double widthMM = widthInches * MM_PER_INCH;
        double heightMM = heightInches * MM_PER_INCH;

        // Display the dimensions in millimeters
        System.out.println("The width of the sheet in millimeters is: " + widthMM);
        System.out.println("The height of the sheet in millimeters is: " + heightMM);
    }
}
