/*
 Student name:Minal Pariyar
 Date: 01/28/2023
 Program description: Converts gallons to liters
 */

public class VolumeConversion {
public static void main(String[] args) {      
double gallons=14;
final double CONVERSION_FACTOR = 4.546;
String message1 = "The number of liters in ";
String message2 = " gallons is ";
double liters = gallons * CONVERSION_FACTOR;
 System.out.println(message1+ gallons + message2+ liters);
    }
}
