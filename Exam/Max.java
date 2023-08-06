package Day2;

public class Max {
    public static void main(String[] args) {
        int num[] = { 19, 28, 37, 66, 85 }, i;
        int max = num[0];
        for (i = 0; i < 5; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Max:" + max);
    }

}
