import java.util.Scanner;

/**
 * Lab Sheet-01 | Q3: Check whether a number is even or odd using the modulus operator and if-else.
 */
public class Q03_EvenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is an EVEN number.");
            } else {
                System.out.println(number + " is an ODD number.");
            }
        }
    }
}
