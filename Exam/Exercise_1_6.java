package Day3;

import java.util.Scanner;

public class Exercise_1_6 {
    public static void main(String[] args) {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        // Define the value of Pi
        double pi = Math.PI;

        // Calculate the area of the circle
        double circleArea = pi * Math.pow(radius, 2);

        // Calculate the circumference of the circle
        double circumference = 2 * pi * radius;

        // Calculate the volume of the sphere
        double sphereVolume = (4.0 / 3.0) * pi * Math.pow(radius, 3);

        // Calculate the surface area of the sphere
        double sphereSurfaceArea = 4 * pi * Math.pow(radius, 2);

        // Print the results
        System.out.println("Circle: ");
        System.out.println("Area = " + circleArea);
        System.out.println("Circumference = " + circumference);
        System.out.println("Sphere: ");
        System.out.println("Volume = " + sphereVolume);
        System.out.println("Surface Area = " + sphereSurfaceArea);
    }

}
