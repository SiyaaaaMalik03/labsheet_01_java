import java.util.Scanner;

/**
 * Lab Sheet-01 | Q7: Check if a number is divisible by both 3 and 5 using logical operators.
 */
public class Q07_DivisibleBy3And5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number % 3 == 0 && number % 5 == 0) {        // logical AND
                System.out.println(number + " is divisible by both 3 and 5.");
            } else {
                System.out.println(number + " is NOT divisible by both 3 and 5.");
            }
        }
    }
}
