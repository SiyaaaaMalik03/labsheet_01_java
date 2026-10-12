import java.util.Scanner;

/**
 * Lab Sheet-01 | Q2: Input two integers and print the result of all arithmetic operations.
 */
public class Q02_ArithmeticOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first integer  : ");
            int a = sc.nextInt();
            System.out.print("Enter second integer : ");
            int b = sc.nextInt();

            System.out.println("Addition       : " + a + " + " + b + " = " + (a + b));
            System.out.println("Subtraction    : " + a + " - " + b + " = " + (a - b));
            System.out.println("Multiplication : " + a + " * " + b + " = " + (a * b));

            if (b != 0) {
                System.out.println("Division       : " + a + " / " + b + " = " + (a / b));
                System.out.println("Modulus        : " + a + " % " + b + " = " + (a % b));
            } else {
                System.out.println("Division and modulus are not possible when the second number is 0.");
            }
        }
    }
}
