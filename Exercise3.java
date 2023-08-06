// //Amend the skeleton program on the next page so that:
// 1. It contains a constant for the conversion of gallons into litres. (1 gallon = 4.546 litres).
// 2. It contains a gallons variable which is initialised to 14.
// 3. It contains a litres variable.
// 4. It contains a String initialised to "The number of litres in ".
// 5. It contains a String initialised to " gallons is ". Note spaces!
// 6. It contains the assignment : litres variable = gallons variable * conversion constant.
// 7. It outputs the first String concatenated with the gallons variable, concatenated with the
// second String concatenated with the litres variable.//

public class Exercise {
    public static void main(String args[]) {

        final double GALLONLITRE = 4.546;
        double gallons = 14;

        String ini = "The number of litres in ";
        String vni = " gallons is ";

        double litres = gallons * GALLONLITRE;

        System.out.println(ini + gallons + vni + litres);
    }
}
