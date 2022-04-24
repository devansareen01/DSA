import java.util.Scanner;

public class primeFactoriztion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
        }

        if (n != 1) {
            System.out.println(n);
        }
    }
}
