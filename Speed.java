/*Bicyclists can calculate their speed if the gear size and cadence is known.
Gear size refers to the effective diameter of the wheel. Gear size multiplied
by pi (3.14) gives the distance travelled with one turn of the pedals.
Cadence refers to the number of pedal revolutions per minute (rpm). The
speed in miles per hour is calculated by the following:

This is a program that calculates the speed for a gear size of 100 inches
and a cadence of 90 rpm. This would be considered a high cadence and a
maximum gear size for a typical bicycle.96
1/12 will result in 0, because both 1 and 12 are integers, and when the
integer division is performed, the fractional part is discarded.*/

public class Speed{
public static void main(String [] args){

final double PI=3.14;
final double dimeter= 100;
double distancetravelled= PI* dimeter;
final double rpm=90;
double jj=1.0/5280;
double fra=(1.0/12);

double totalspeed=distancetravelled *jj *rpm* fra* 60; 

System.out.println("the total speed="+ totalspeed);
}}




