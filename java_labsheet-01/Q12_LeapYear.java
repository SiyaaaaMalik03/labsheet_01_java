import java.util.Scanner;

/**
 * Lab Sheet-01 | Q11: Input three numbers and print the largest using nested if-else.
 */
public class Q11_LargestOfThree {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number  : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();
            System.out.print("Enter third number  : ");
            int c = sc.nextInt();

            int largest;
            if (a >= b) {
                if (a >= c) {          // nested if-else
                    largest = a;
                } else {
                    largest = c;
                }
            } else {
                if (b >= c) {
                    largest = b;
                } else {
                    largest = c;
                }
            }
            System.out.println("The largest number is " + largest);
        }
    }
}
