package Day3;

public class Exercise1 {

    public static void main(String[] args) {
        // Define the constant for millimeters per inch
        final double MM_PER_INCH1 = 25.4;

        // Define the width and height of the letter-size sheet in inches
        double widthInches1 = 8.5;
        double heightInches1 = 11.0;

        // Calculate the dimensions in millimeters
        double widthMM1 = widthInches1 * MM_PER_INCH1;
        double heightMM1 = heightInches1 * MM_PER_INCH1;

        // Display the dimensions in millimeters
        System.out.println("The width of the sheet in millimeters is: " + widthMM1);
        System.out.println("The height of the sheet in millimeters is: " + heightMM1);

    }
}