package Day2;

import java.util.Scanner;

public class Loop1 {
    public static void main(String[] args) {
        // for (int i = 10; i >= 1; i--) {
        // System.out.println(i + "");
        // }
        final int MAX = 5;
        int nums[] = new int[MAX];
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" Enter the number: ");
            nums[i] = new Scanner(System.in).nextInt();

        }

        for (int i = 0; i <= 5; i++)
            System.out.println("\n\t" + nums[i]);

    }

}
