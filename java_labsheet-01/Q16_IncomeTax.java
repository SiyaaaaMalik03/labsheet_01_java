import java.util.Scanner;

/**
 * Lab Sheet-01 | Q15: Check whether a 3-digit number is an Armstrong number.
 * Armstrong number: sum of the cubes of its digits equals the number (e.g. 153 = 1^3 + 5^3 + 3^3).
 */
public class Q15_ArmstrongNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a 3-digit number: ");
            int number = sc.nextInt();

            if (number < 100 || number > 999) {
                System.out.println("Please enter a valid 3-digit number (100 to 999).");
            } else {
                int hundreds = number / 100;
                int tens = (number / 10) % 10;
                int units = number % 10;

                int sum = (hundreds * hundreds * hundreds)
                        + (tens * tens * tens)
                        + (units * units * units);

                if (sum == number) {
                    System.out.println(number + " is an ARMSTRONG number. (" + sum + ")");
                } else {
                    System.out.println(number + " is NOT an Armstrong number. (sum of cubes = " + sum + ")");
                }
            }
        }
    }
}
