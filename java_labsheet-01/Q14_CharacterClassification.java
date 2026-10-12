import java.util.Scanner;

/**
 * Lab Sheet-01 | Q13: Check whether a number is positive, negative or zero using if-else.
 */
public class Q13_PositiveNegativeZero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            double number = sc.nextDouble();

            if (number > 0) {
                System.out.println(number + " is POSITIVE.");
            } else if (number < 0) {
                System.out.println(number + " is NEGATIVE.");
            } else {
                System.out.println("The number is ZERO.");
            }
        }
    }
}
