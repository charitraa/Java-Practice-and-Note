package Day3;

import java.util.Scanner;

public class Exercise_3_3 {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle: ");
        double radius = new Scanner(System.in).nextDouble(); // input radius as a double
        double circumference = 2 * Math.PI * radius; // calculate circumference
        double area = Math.PI * radius * radius; // calculate area
        double volume = (4 / 3) * Math.PI * Math.pow(radius, 3); // calculate volume of sphere
        System.out.println("Radius: " + radius);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
        System.out.println("Volume of sphere: " + volume);
    }
}