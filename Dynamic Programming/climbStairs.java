import java.util.Scanner;

public class climbStairs {
 

    public static int countp(int n) {
        int dp[] = new int[n + 1];
        dp[0]=1;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else if (i == 2) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cp = countp(n);
        System.out.println(cp);
    }
}
