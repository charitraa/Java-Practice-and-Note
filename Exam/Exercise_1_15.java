package Day3;

/*
(The\n escape sequence denotes a“newline”character that causes

subsequent characters to be printed on a new line.)

Do the same for the letters E,L,and O.Then write the message:

H

E

L

L

O

in large letters.*/
public class Exercise_1_15 {

    public static void main(String[] args) {

        final String LETTER_H = "*   *\n*   *\n*****\n*   *\n*   *\n";

        final String LETTER_E = "*****\n* \n* \n*****\n* \n* \n*****";

        final String LETTER_0 = " ** \n*  *\n*  *\n*  *\n*  *\n*  *\n ** ";

        final String LETTER_L = "*\n*\n*\n*\n*\n*\n*****";

        System.out.println("\n" + LETTER_H);

        System.out.println("\n" + LETTER_E);

        System.out.println("\n" + LETTER_L);

        System.out.println("\n" + LETTER_L);

        System.out.println("\n" + LETTER_0);

    }

}
