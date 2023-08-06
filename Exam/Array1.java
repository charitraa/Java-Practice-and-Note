package Day1;

import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        int num[] = { 9, 8, 7, 6, 5 }, i;
        int sum = 0;
        Arrays.sort(num);
        for (i = 0; i < 5; i++) {
            sum += num[i];
        }
        System.out.println("Sum: " + sum);

        int average = sum / 5;
        System.out.println("Average: " + average);
        Arrays.sort(num);

        System.out.println("Min: " + num[0]);
        System.out.println("max:" + num[num.length - 1]);

        int min = num[0];
        int max = num[0];
        for (i = 0; i < 5; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }

        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

    }
}