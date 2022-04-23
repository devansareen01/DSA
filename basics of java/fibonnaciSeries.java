import java.util.*;

public class fibonnaciSeries {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f1 = 0;
        int f2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(f1 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

    }
}
