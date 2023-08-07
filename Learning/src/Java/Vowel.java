package Java;
import java.util.Scanner;

public class Vowel{
public static void main(String[] args){

Scanner min= new Scanner(System.in);
min.close();
System.out.print("enter a letter= ");
String Letter= min.nextLine();
String lowercase, uppercase;
lowercase= "a || e || i || o || u";
uppercase= "A || E || I || O || U";
if(Letter==lowercase && Letter==uppercase){
System.out.println("The input letter is vowel");

}else{
System.out.println("The input letter is consonant");
}}}