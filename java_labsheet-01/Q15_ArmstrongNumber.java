import java.util.Scanner;

/**
 * Lab Sheet-01 | Q14: Check whether a character is a digit, uppercase letter,
 * lowercase letter or a special character (character classification + if-else).
 */
public class Q14_CharacterClassification {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            if (Character.isDigit(ch)) {
                System.out.println("'" + ch + "' is a DIGIT.");
            } else if (Character.isUpperCase(ch)) {
                System.out.println("'" + ch + "' is an UPPERCASE letter.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println("'" + ch + "' is a LOWERCASE letter.");
            } else {
                System.out.println("'" + ch + "' is a SPECIAL character.");
            }
        }
    }
}
