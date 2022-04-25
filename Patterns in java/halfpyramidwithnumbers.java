
import java.util.Scanner;

public class halfpyramidwithnumbers {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("enter numbers");
        int n = ds.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }
}
