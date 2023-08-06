package Day1;

import java.util.ArrayList;

public class Week_DAy1 {
    public static void main(String[] args) {
        int nums[] = { 9, 7, 8, 5, 10 };

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        ArrayList aList = new ArrayList();
        boolean result = aList.add(45);
        System.out.println(result);
        result = aList.add(50);
        System.out.println(result);
        result = aList.add(65);
        System.out.println(result);

    }

}
