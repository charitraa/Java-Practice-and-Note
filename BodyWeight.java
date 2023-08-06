/*A simple rule to estimate your ideal body weight is to allow 110 pounds for
the first 5 feet of height and 5 pounds for each additional inch. Write a
program with a variable for the height of a person in feet and another
variable for the additional inches. Assume the person is at least 5 feet tall.
For example, a person that is 6 feet and 3 inches tall would be represented
with a variable that stores the number 6 and another variable that stores the
number 3. Based on these values, calculate and output the ideal body
weight.*/

import java.util.Scanner;
public class BodyWeight{
public static void main(String[] args){

final int INITIALIZE_BODYWEIGHT_FORFIVEFEET=110;
Scanner m= new Scanner(System.in);

System.out.println("enter height:");
int height= m.nextInt();
if(height<5){
System.out.println("We are sorry. the height must be greater than 5");
return;
}

System.out.println("enter inch:");
int heightInch= m.nextInt();
if(heightInch==0){
System.out.println("We are sorry. the input must be greater than 0");
return;
}

int totalheight=height*12;
int idelBodyWeight=110+((totalheight-60)+heightInch);


System.out.println("the ideal body weight ="+idelBodyWeight);}}




