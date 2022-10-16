import java.util.Scanner;

public class countBalancedBinarytree {
    public static int countBalancedBinarytree(int h) {
        int dp[] = new int[h + 1];
        int mod = (int) Math.pow(10, 9) + 7;

        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= h; i++) {
            int x = dp[i - 1];
            int y = dp[i - 2];
            long res1 = (long) x * x;// int*int can be larger then the capacity that an integer can store so we are taking long
            long res2 = (long) x * y * 2;

            int val1 = (int) (res1 % mod);
            int val2 = (int) (res2 % mod);
            dp[i] = (val1 + val2) % mod;
        }
        return dp[h];
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int h = scn.nextInt();
        System.out.println(countBalancedBinarytree(h));
    }
}
