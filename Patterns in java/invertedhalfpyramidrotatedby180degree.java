
import java.util.Scanner;

public class invertedhalfpyramidrotatedby180degree {

    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("enter number ");
        int n = ds.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {/// innnner looop->> space print
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {// 2 inner loop -->> *print
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
