import java.util.Scanner;

public class hollowbutterfly {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("      enter number of lines");
        int n = ds.nextInt();
        //// UPPER HALF
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {/// UPPER HALF1 part
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");// spaces in 1 st part
                }
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");/// spaces
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {//// uper half 2 nd part
                    System.out.print("*");
                } else {
                    System.out.print(" ");/// spaces in upper half second part
                }
            }
            System.out.println();
        }
        /// LOWER HALF ONLY CHANGE OUTER LOOP FROM I = NTO 1 AND I--
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {/// UPPER HALF1 part
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");// spaces in 1 st part
                }
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");/// spaces
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {//// uper half 2 nd part
                    System.out.print("*");
                } else {
                    System.out.print(" ");/// spaces in upper half second part
                }
            }
            System.err.println();
        }
    }
}
