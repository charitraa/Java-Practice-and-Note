/*A government research lab has concluded that an artificial sweetener
commonly used in diet soda pop will cause death in laboratory mice. A
friend of yours is desperate to lose weight but cannot give up soda pop.
Your friend wants to know how much diet soda pop it is possible to drink
without dying as a result.
Write a program to supply the answer. The program has no input but does
have defined constants for the following items: the amount of artificial
sweetener needed to kill a mouse, the weight of the mouse, the starting
weight of the dieter, and the desired weight of the dieter. To ensure the
safety of your friend, be sure the program uses the weight at which the
dieter will stop dieting, rather than the dieter’s current weight, to calculate
how much soda pop the dieter can safely drink. You may use any
reasonable values for these defined constants. Assume that diet soda
contains 1/10th of 1% artificial sweetener. Use another named constant for
this fraction.
You may want to express the percent as the double value 0.001. (If your
program turns out not to use a defined constant, you may remove that
defined constant from your program.)*/
public class Sodapop {
    public static void main(String[] args) {
        final double SWEETENERTO_KILLMOUSE = 0.001;
        final int MOUSE_WEIGHT = 30;
        final int STARTING_WEIGHT = 150;
        final int DESIRED_WEIGHT = 120; 
        final double SODA_PERCENTAGE = 0.001; // percentage of artificial sweetener in diet soda

        // convert pounds to grams
        int weightInGrams = (int) (STARTING_WEIGHT * 453.59237);

        // calculate the amount of sweetener the dieter can have
        double sweetenerAmount = SWEETENERTO_KILLMOUSE / (MOUSE_WEIGHT / weightInGrams);

        // calculate the amount of soda the dieter can safely drink
        double sodaAmount = sweetenerAmount / SODA_PERCENTAGE;

        System.out.println("You can safely drink up to " + sodaAmount + " grams of diet soda.");
    }
}




