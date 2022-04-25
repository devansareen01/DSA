
import java.util.Scanner;

public class hollowrectangle {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = ds.nextInt();
        System.out.println("enter number of columns");
        int m = ds.nextInt();
        for (int i = 1; i <= n; i++) { // outer loop for rows
            for (int j = 1; j <= m; j++) {// inner loop for columns
                if (i == 1 || i == n || j == 1 || j == m) {// cell(i,j)
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

}
