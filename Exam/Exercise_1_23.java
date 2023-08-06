package Day3;

import java.util.Scanner;

public class Exercise_1_23 {
    public static void main(String[] args) {
        System.out.println("Enter the number of movie rentals: ");
        int src = new Scanner(System.in).nextInt();
        System.out.println("Enter the number of members referred to the video club: ");
        int src1 = new Scanner(System.in).nextInt();
        int discount = Math.min(75, src + src1);
        System.out.println("Discount: " + discount + "%");
    }
}
