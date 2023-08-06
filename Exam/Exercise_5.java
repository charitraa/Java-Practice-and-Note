// Write a program to calculate the circumference of a circle, its area and the volume of a sphere.

// Display the radius and the results in a clear format.

package Day3;

import java.util.Scanner;

public class Exercise_5 {

  public static final double PI = 3.142857;

  public static void main(String[] args) {
    byte b;
    String s = new String();
    System.out.println("enter any number: ");
    b = new Scanner(System.in).nextByte();
    s = Byte.toString(b);
    System.out.println("String: " + s);
  }
}
