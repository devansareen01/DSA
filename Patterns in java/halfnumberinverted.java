import java.util.Scanner;

public class halfnumberinverted {

    public static void main(String[] args) {
        Scanner ds = new Scanner(System.in);
        System.out.println("enter number ");
        int n = ds.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {/// innnner looop->> space print
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
