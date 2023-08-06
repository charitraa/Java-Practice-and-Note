/*Write a program that outputs the number of hours, minutes, and seconds
that corresponds to 50,391 total seconds. The output should be 13 hours,
59 minutes, and 51 seconds. Test your program with a different number of
total seconds to ensure that it works for other cases.*/

public class Seconds{
public static void main(String[] args){

int hour=13;
int min=59;
int sec=51;

int sec1= hour*60*60;
int sec2= min*60;
int totaalseconds= sec1 +sec2+ sec;
System.out.println("total seconds="+totaalseconds);
}}


