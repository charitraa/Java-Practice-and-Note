package Day3;

import java.util.Scanner;

public class LoopingTest {
    public static void main(String[] args) {
        final int MAX = 5;// declare and initialize an array with 5 elements
        int nums[] = new int[MAX];
        nums[0] = 9;
        nums[1] = 10;
        nums[2] = 7;
        nums[3] = 6;
        nums[4] = 2;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / nums.length);

        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("max: " + max);

        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println("min: " + min);
        // for seaching the number
        System.out.println("Enter the number which u wants to search:");
        int num = new Scanner(System.in).nextInt();
        boolean result = false;
        for (int i = 0; i < num; i++) {
            if (nums[i] == num) {
                result = true;
                break;
            }
        }
        if (result == false) {
            System.out.println(num + "not found");
        } else
            System.out.println(num + "found");
        // for ascending order
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println("The array are in ascending order: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
