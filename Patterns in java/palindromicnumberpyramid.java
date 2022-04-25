import java.util.Scanner;

public class palindromicnumberpyramid {
    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("enter number of rows");
        int n = ds.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.err.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
