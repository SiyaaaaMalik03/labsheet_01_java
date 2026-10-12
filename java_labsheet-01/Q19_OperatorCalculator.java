import java.util.Scanner;

/**
 * Lab Sheet-01 | Q18: Print whether a number is prime or not using if-else.
 */
public class Q18_PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            boolean isPrime = true;
            if (number <= 1) {
                isPrime = false;                       // 0, 1 and negatives are not prime
            } else {
                for (int i = 2; i * i <= number; i++) {   // checking up to sqrt(number) is enough
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(number + " is a PRIME number.");
            } else {
                System.out.println(number + " is NOT a prime number.");
            }
        }
    }
}
