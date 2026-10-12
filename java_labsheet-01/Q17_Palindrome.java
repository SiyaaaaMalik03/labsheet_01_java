import java.util.Scanner;

/**
 * Lab Sheet-01 | Q16: Input salary and calculate tax based on income slabs using if-else.
 *   Income <= 250000        : No tax
 *   250001 to 500000        : 5%
 *   500001 to 1000000       : 20%
 *   Above 1000000           : 30%
 *
 * The program shows two results because the question can be read in two ways:
 *   (a) Slab rate applied to the WHOLE income (simple reading of the question).
 *   (b) Progressive tax - each slab's rate applied only to the part of income inside that slab.
 */
public class Q16_IncomeTax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter annual salary (income): ");
            double income = sc.nextDouble();

            if (income < 0) {
                System.out.println("Income cannot be negative.");
                return;
            }

            // (a) rate applied on the whole income
            double rate;
            if (income <= 250000) {
                rate = 0;
            } else if (income <= 500000) {
                rate = 5;
            } else if (income <= 1000000) {
                rate = 20;
            } else {
                rate = 30;
            }
            double simpleTax = income * rate / 100;

            // (b) progressive (slab-wise) tax
            double progressiveTax;
            if (income <= 250000) {
                progressiveTax = 0;
            } else if (income <= 500000) {
                progressiveTax = (income - 250000) * 0.05;
            } else if (income <= 1000000) {
                progressiveTax = (250000 * 0.05) + (income - 500000) * 0.20;
            } else {
                progressiveTax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
            }

            System.out.printf("Income                         : %.2f%n", income);
            System.out.printf("Tax slab rate                  : %.0f%%%n", rate);
            System.out.printf("(a) Tax on whole income        : %.2f%n", simpleTax);
            System.out.printf("(b) Tax if slabs are progressive: %.2f%n", progressiveTax);
        }
    }
}
