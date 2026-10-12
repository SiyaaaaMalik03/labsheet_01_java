import java.util.Scanner;

/**
 * Lab Sheet-01 | Q17: Check whether an integer is a palindrome using arithmetic operations and type casting.
 */
public class Q17_Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println(number + " is NOT a palindrome (negative numbers are not considered).");
                return;
            }

            long temp = number;          // widening: int -> long (implicit conversion)
            long reversed = 0;
            while (temp > 0) {
                int digit = (int) (temp % 10);        // explicit casting: long -> int
                reversed = reversed * 10 + digit;
                temp = temp / 10;
            }

            if (reversed == number) {
                System.out.println(number + " is a PALINDROME.");
            } else {
                System.out.println(number + " is NOT a palindrome. (reverse = " + reversed + ")");
            }
        }
    }
}
