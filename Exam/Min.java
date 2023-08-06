package Day2;

public class Min {
    public static void main(String[] args) {
        int num[] = { 19, 28, 37, 66, 85 }, i;
        int min = num[0];
        for (i = 0; i < 5; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Min:" + min);
    }

}
