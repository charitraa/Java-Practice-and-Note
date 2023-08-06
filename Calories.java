/*One way to measure the amount of energy that is expended during
exercise is to use metabolic equivalents (MET). Here are some METS for
various activities:
Running 6 MPH: 10 METS
Basketball: 8 METS
Sleeping: 1 MET
The number of calories burned per minute may be estimated using the
following formula:
CaloriesjMinute = 0.0175 * MET * Weight in kilograms
Write a program that calculates and outputs the total number of calories
burned for a 150-pound person who runs 6 MPH for 30 minutes, plays
basketball for 30 minutes, and then sleeps for 6 hours. One kilogram is
equal to 2.2 pounds.*/

public class Calories{
public static void main(String [] args){

double weight=150;
double Tweight=150/2.2;

double running=10;
double calorie1= 0.0175* running * Tweight;

double basketball=8;
double calorie2= 0.0175* basketball* Tweight;

double sleeping=1;
double calorie3= 0.0175* sleeping * Tweight;

double totalcalories= calorie1 + calorie2+ calorie3;
System.out.println("Total calories burned by a 150 pound person ="+totalcalories);
}}
