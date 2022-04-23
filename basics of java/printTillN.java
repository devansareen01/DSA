import java.util.Scanner;

public class printTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for (int n = low; n <= high; n++) {
            int div = 2;
            while (div * div <= n) {
                if (n % div == 0) {
                    break;
                }
                div++;
            }
            if (div * div > n) {
                System.out.println(n);
            }
        }

    }
}
