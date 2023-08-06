/*Write a program that prints the balance of an account after the first,
second, and third year. The account has an initial balance of £1,000 and
earns 5 percent interest per year.*/

public class Simpleinterest{
public static void main(String[] args){

int p=1000;
int r=5;
int t=3;

int si=(p*t*r)/100;
System.out.println("the balance of account after the first three years=£"+si );
}}