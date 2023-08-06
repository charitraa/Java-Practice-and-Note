package saparsha;

import java.util.Scanner;

public class Dimension {

    public static void main(String[] args) {
        final int MAX_ROWS = 4;
        final int MAX_COLS = 4;
        int ourWeights[][] = new int[MAX_ROWS][MAX_COLS];// array initialize

        for (int a = 0; a < MAX_ROWS; a++) {
            for (int b = 0; b < MAX_COLS; b++) {
                System.out.print("Enter the weight of individual student=");
                ourWeights[a][b] = new Scanner(System.in).nextInt();
            }
        }

        for (int a = 0; a < MAX_ROWS; a++) {
            for (int b = 0; b < MAX_COLS; b++) {
                System.out.print(ourWeights[a][b] + " ");
            }
            System.out.println();
        }

        float sum = 0;
        for (int a = 0; a < MAX_COLS; a++) {
            for (int b = 0; b < MAX_COLS; b++) {
                sum += ourWeights[a][b];
            }
        }

        System.out.println("Average Weight of Student " + sum / 16 + " in the class.");
    }
}
