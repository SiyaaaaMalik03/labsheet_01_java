import java.util.Scanner;

/**
 * Lab Sheet-01 | Q9: Input marks of three subjects, calculate total and percentage,
 * and print pass/fail (passing criteria: >= 40% in ALL subjects).
 * Marks are assumed to be out of 100 for each subject.
 */
public class Q09_MarksPassFail {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter marks of subject 1 (out of 100): ");
            int m1 = sc.nextInt();
            System.out.print("Enter marks of subject 2 (out of 100): ");
            int m2 = sc.nextInt();
            System.out.print("Enter marks of subject 3 (out of 100): ");
            int m3 = sc.nextInt();

            if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100) {
                System.out.println("Invalid marks! Each mark must be between 0 and 100.");
            } else {
                int total = m1 + m2 + m3;
                double percentage = total / 3.0;           // 3.0 forces decimal division

                System.out.println("Total      : " + total + " / 300");
                System.out.printf("Percentage : %.2f%%%n", percentage);

                if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
                    System.out.println("Result     : PASS");
                } else {
                    System.out.println("Result     : FAIL (minimum 40% required in every subject)");
                }
            }
        }
    }
}
