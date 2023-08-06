package Day2;

public class Ascending {
    public static void main(String[] args) {
        int nums[] = { 2, 44, 33, 55, 12, 6, 98, 67, 899, 34, 56, 70 };
        int i, j, temp;
        int length = nums.length;
        for (i = 0; i < length - 1; i++) {
            for (j = i + 1; j < length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println("The array are in ascending order: ");
        for (i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");

        }
    }

}
