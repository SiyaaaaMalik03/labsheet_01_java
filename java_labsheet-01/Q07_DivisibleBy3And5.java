import java.util.Scanner;

/**
 * Lab Sheet-01 | Q6: Accept a character and print its ASCII value.
 */
public class Q06_AsciiValue {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = sc.next().charAt(0);

            int ascii = (int) ch;                // char -> int gives the ASCII (Unicode) value
            System.out.println("ASCII value of '" + ch + "' is " + ascii);
        }
    }
}
