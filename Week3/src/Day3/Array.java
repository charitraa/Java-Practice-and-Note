package Day3;

public class Array {
    public static void main(String[] args) {
        int num[] = { 4, 8, 3, 4, 7, 8, 9, 9 };
        boolean a = false;
        int search = 8;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == search) {
                a = true;
                break;

            }
            if (a == true) {

            } else {

            }

        }

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] == search) {

                }
            }

        }
    }
}
