package Day2;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int nums[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int search = 10;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] == search) {
                System.out.println("found" + i);

            }

        }

    }
}