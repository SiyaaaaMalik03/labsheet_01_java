import java.util.Scanner;

/**
 * Lab Sheet-01 | Q5: Accept a floating-point number and convert it explicitly to an integer.
 * Explicit conversion (type casting) from double to int removes the decimal part (no rounding).
 */
public class Q05_TypeConversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a floating-point number: ");
            double original = sc.nextDouble();

            int converted = (int) original;      // explicit casting

            System.out.println("Original value  (double) : " + original);
            System.out.println("Converted value (int)    : " + converted);
        }
    }
}
