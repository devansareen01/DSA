
import java.util.Scanner;

public class halfpyramid {
    public static void main(String[] args) {

        System.out.println("enter number of rows");
        Scanner ds = new Scanner(System.in);
        int n = ds.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

}
