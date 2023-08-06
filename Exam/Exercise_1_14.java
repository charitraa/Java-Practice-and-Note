package Day3;

import java.util.Scanner;

public class Exercise_1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first time: ");
        int firstTime = scanner.nextInt();
        System.out.print("Please enter the second time: ");
        int secondTime = scanner.nextInt();

        int firstTimeInMinutes = (firstTime / 100) * 60 + firstTime % 100;
        int secondTimeInMinutes = (secondTime / 100) * 60 + secondTime % 100;

        int differenceInMinutes = Math.abs(firstTimeInMinutes - secondTimeInMinutes);

        int hours = differenceInMinutes / 60;
        int minutes = differenceInMinutes % 60;

        System.out.println(hours + " hours " + minutes + " minutes");
    }

}
