import java.util.Scanner;

public class numberpramid {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = ds.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

}
