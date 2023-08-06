/*To speak more than one language is a valuable skill in the labour market

today. One of the basic skills is learning to greet people.
Write a program that prints a two-column list with the greeting phrases
shown in the following table. In the first column, print the phrase in
English: in the second column, print the phrase in a language of your
choice.
List of Phrases to Translate
Good morning.
It is a pleasure to meet you.
Please call me tomorrow.
Have a nice day!*/
import java.util.Arrays;
import java.util.List;

public class GreetingTranslate {
    public static void main(String[] args) {
        // Greeting phrases in English and French
        List<String[]> phrases = Arrays.asList(
            new String[] {"Good morning.", "Bonjour."}, 
            new String[] {"It is a pleasure to meet you.", "C'est un plaisir de vous rencontrer."}, 
            new String[] {"Please call me tomorrow.", "S'il vous plaît appelez-moi demain."}, 
            new String[] {"Have a nice day!", "Passez une bonne journée!"}
        );

        // Print the phrases in a two-column format
        for (String[] phrase : phrases) {
            System.out.printf("%-25s %-25s%n", phrase[0], phrase[1]);
        }
    }
}