package Day3;

public class Exercise_1_17 {
    public static void main(String[] args) {
        // height of the tree
        int height = 5;

        // loop through each row
        for (int row = 1; row <= height; row++) {
            // print spaces
            for (int space = height - row; space >= 1; space--) {
                System.out.print(" ");
            }

            // print asterisks
            for (int asterisk = 1; asterisk <= (2 * row - 1); asterisk++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();
        }

        // print the trunk
        for (int trunkRow = 1; trunkRow <= 2; trunkRow++) {
            // print spaces before the trunk
            for (int space = height - 2; space >= 1; space--) {
                System.out.print(" ");
            }

            // print the trunk
            System.out.println("***");
        }
    }

}
