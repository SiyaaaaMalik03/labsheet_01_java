import java.util.Scanner;

/**
 * Lab Sheet-01 | Q4: Demonstrate relational operators by comparing two numbers.
 */
public class Q04_RelationalOperators {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number  : ");
            double a = sc.nextDouble();
            System.out.print("Enter second number : ");
            double b = sc.nextDouble();

            System.out.println(a + " == " + b + " : " + (a == b));
            System.out.println(a + " != " + b + " : " + (a != b));
            System.out.println(a + " >  " + b + " : " + (a > b));
            System.out.println(a + " <  " + b + " : " + (a < b));
            System.out.println(a + " >= " + b + " : " + (a >= b));
            System.out.println(a + " <= " + b + " : " + (a <= b));
        }
    }
}
