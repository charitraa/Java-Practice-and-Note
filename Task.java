import java.util.Scanner;

public class Task {
    static void demo() {
        Scanner mn = new Scanner(System.in);
        System.out.println("Are you a girl or boy, type yes or no:");
        Boolean name = mn.nextBoolean();

        if (name == true) {
            System.out.println("are you interested in It, true or false?");
            Boolean it = mn.nextBoolean();

            if (it == true) {
                System.out.println("which it fielld are u interested in :");
                String field = mn.nextLine();
                System.out.println("Thanks:");
            } else {
                System.out.println("thanks for approaching us");
            }
        } else {
            System.out.println("Are u interested in game");
            Boolean game = mn.nextBoolean();

            if (game == true) {
                System.out.println("which game are u interested in");
                String hhh = mn.nextLine();

                System.out.println("thanks for approaching us");
            } else {
                System.out.println("thanks for approaching us");
            }
        }
    }

    public static void main(String args[]) {
        demo();
    }
}