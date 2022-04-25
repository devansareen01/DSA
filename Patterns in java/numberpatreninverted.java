
import java.util.Scanner;

public class numberpatreninverted {

    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = ds.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
