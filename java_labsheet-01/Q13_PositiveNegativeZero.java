import java.util.Scanner;

/**
 * Lab Sheet-01 | Q12: Check whether a year is a leap year using if-else.
 * Rule: divisible by 400, OR divisible by 4 but not by 100.
 */
public class Q12_LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a LEAP year.");
            } else {
                System.out.println(year + " is NOT a leap year.");
            }
        }
    }
}
