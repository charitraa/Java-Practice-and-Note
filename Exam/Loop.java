package Day2;

public class Loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "  ");
        }
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("\nSum:" + sum + "");
        System.out.println("Average:" + sum / 10 + "");

    }

}
