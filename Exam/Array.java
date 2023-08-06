package Day2;

import java.util.*;

public class Array {
    public static void main(String[] args) {
        String[] g = { "ravis", "charitra", "neha", "Susan" };
        //changing Array to ArrayList
        List a = Arrays.asList(g);

        System.out.println(a);

        ArrayList ArrLis = new ArrayList();

        // Add elements
        ArrLis.add(32);
        ArrLis.add(67);
        ArrLis.add(98);
        ArrLis.add(100);
        System.out.println("ArrayList: "
                + ArrLis);//print the array
        //changing arrraylist to array
        Object[] arr = ArrLis.toArray();

        System.out.println("Elements of ArrayList"
                + " as Array: "
                + Arrays.toString(arr));

    }
}
