//write the program to convert the string into other datatype

package Day3;
public class Assignment { //class assignment
    public static void main(String[] args){ 

        

        // converting string to integer
         // declare the variables
    String str0 = "56";
        // using parseint()
    int num0 = Integer.parseInt(str0);

    // print integer values
    System.out.println("Integer: "+num0); 


    // converting string to double


    // declare the variables
    String str1 = "345.56";

    
    // using parseDouble()
    double num1 = Double.parseDouble(str1);

    // print double values
    System.out.println("Double:"+num1); 


     // converting string to byte


    // declare the variables
    String str2 = "35";

    
    // using parseByte()
    byte num2 = Byte.parseByte(str2);

    // print byte values
    System.out.println("Byte:"+num2); 

     // converting string to short


    // declare the variables
    String str3 = "11";

    
    // using parseShort()
    short num3 = Short.parseShort(str3);

    // print Short values
    System.out.println("Short:"+num3); 

     // converting string to Long


    // declare the variables
    String str4 = "1234";

    
    // using parseLong()
    long  num4 = Long.parseLong(str4);

    // print Long values
    System.out.println("Long:"+num4); 

     // converting string to float


    // declare the variables
    String str5 = "98.56";

    
    // using parseFloat()
    float num5 = Float.parseFloat(str5);

    // print Float values
    System.out.println("Float: "+num5); 

     // converting string to char


    // declare the variables
    String str6 = "rabi";

    
    // using str6.charAt(0)
    char num6 = str6.charAt(0);

    // print char values
    System.out.println("char:"+num6); 

     // converting string to boolean


    // declare the variables
    String str7 = "TRue";

    
    // using parseBoolean()
    boolean num7 = Boolean.parseBoolean(str7);

    // print Boolean values
    System.out.println("Boolean:"+num7); 

        
    }
    
}
