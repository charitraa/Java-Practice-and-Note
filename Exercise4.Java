/*Write a program to add together the following marks and find the average:
45, 56, 34, 89
Output all the marks, the total (sum) and the average mark.
Note: Identify the total number of variables needed, their data types and choose appropriate
names.
Note: The average is calculated as (45+56+34+89)/4.*/

public class Exercise4{
public static void main(String [] args){

int a=45;
int b=56;
int c=34;
int d=89;

int sum= a+b+c+d;
int avg= sum/4;

System.out.println("mark 1="+a);
System.out.println("mark 2="+b);
System.out.println("mark 3="+c);
System.out.println("mark 4="+d);

System.out.println("the total sum :"+sum);
System.out.println("the averaage :"+avg);
}}
