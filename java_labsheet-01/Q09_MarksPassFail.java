import java.util.Scanner;

/**
 * Lab Sheet-01 | Q8: Check whether a character is a vowel or a consonant using if-else.
 */
public class Q08_VowelConsonant {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            if (!Character.isLetter(ch)) {
                System.out.println("'" + ch + "' is not an alphabet.");
            } else {
                char lower = Character.toLowerCase(ch);       // handle upper and lower case together
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    System.out.println("'" + ch + "' is a VOWEL.");
                } else {
                    System.out.println("'" + ch + "' is a CONSONANT.");
                }
            }
        }
    }
}
