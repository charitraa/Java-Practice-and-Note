package Day3;

import java.util.Scanner;

public class Exercise_1_26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter thermistor resistance (in Ohms): ");
        double resistance = scan.nextDouble();
        scan.close();

        // Constants for the Steinhart-Hart equation
        final double A = 0.001129148;
        final double B = 0.000234125;
        final double C = 0.0000000876741;

        // Calculate the inverse of the resistance
        double invResistance = 1.0 / resistance;

        // Calculate the temperature using the Steinhart-Hart equation
        double temperature = 1.0 / (A + B * Math.log(resistance) + C * Math.pow(Math.log(resistance), 3));

        // Convert the temperature from Kelvin to Celsius
        temperature = temperature - 273.15;

        System.out.println("Liquid temperature: " + temperature + " C");
    }

}
