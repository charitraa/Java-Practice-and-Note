package Day3;
import java.util.Scanner;
public class Week3_Day4 {

	public static void main(String[]args) {
		/*
		String str1 = new String();
		byte bn = 0;
		System.out.println("enter the number :");
		str1 = new Scanner (System.in).nextLine();
		bn=Byte.parseByte(str1);
		System.out.println("Byte : " +bn);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		*/
		
		/*String str1 = new String();
		short sn=0;
		System.out.println("enter the number :");
		str1 = new Scanner (System.in).nextLine();
		sn=Short.parseShort(str1);
		System.out.print("short: " +sn);
		System.out.println(Short.MAX_VALUE);
		*/
		
		String str1 = new String();
		int in=0;
		System.out.println("enter the number :");
		str1 = new Scanner (System.in).nextLine();
		in=Integer.parseInt(str1);
		System.out.print("Int: " +in);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		String str2= new String();
		Long ln ;
		System.out.println("enter the number :");
		str2 = new Scanner (System.in).nextLine();
		ln=Long.parseLong(str2);
		System.out.print("Long: " +ln);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		String str3= new String();
		float fl = 0;
		System.out.println("enter the number :");
		str3 = new Scanner (System.in).nextLine();
		fl=Float.parseFloat(str3);
		System.out.print("Float: " +fl);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		String str4= new String();
		Double db;
		System.out.println("enter the number :");
		str4 = new Scanner (System.in).nextLine();
		db=Double.parseDouble(str4);
		System.out.print("Double: " +db);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		String str5= new String();
		boolean res = false;
		System.out.println("enter boolean number :");
		str5 = new Scanner (System.in).nextLine();
		res=Boolean.parseBoolean(str5);
		System.out.print("Double: " +res);
		
		String str6= new String();
		char ch;
		System.out.println("enter boolean number :");
		str6 = new Scanner (System.in).nextLine();
		ch=str6.charAt(0);
		System.out.print("Character: " +ch);
		
		
}
}