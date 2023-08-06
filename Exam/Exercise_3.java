// Write a program to convert
// • 23 kilometre to miles and
// • 17 miles to kilometres.

package Day3;
public class Exercise_3 {
    public static void main(String[] args){
        Double kmToMiles = 0.621;//declare the constants variable
        double milesToKm=0.609;

        // Convert 23 km to miles
        double miles = 23 * kmToMiles;
        System.out.println("23 kilometers is equal to " + miles + " miles.");

        // Convert 17 miles to km
        double kilometers = 17 * milesToKm;
        System.out.println("17 miles is equal to " + kilometers + " kilometers.");
    }
    
    
}
