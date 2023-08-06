package Day1;
import java.util.Scanner;
public class Calculate{
      public static void main(String[] args){
      int var1, var2, sum;
      System.out.print("Enter the first number: ");
      Scanner first = new Scanner(System.in);
      var1 = first.nextInt();
      System.out.print("Enter the second number: ");
      Scanner second =new Scanner(System.in);
      var2 = second.nextInt();
      sum = var1 + var2;
      System.out.println("Sum: "+sum);
      first.close();
      second.close();
   }
}

