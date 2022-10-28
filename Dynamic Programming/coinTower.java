import java.util.Scanner;

public class coinTower {
    public static int coinGameWinner(int n, int a, int b) {// approach is to solve problem is if i-1 ,i-x,i-y index of
                                                           // our dp will store false then now a can win
        boolean dp[] = new boolean[n + 1];// for nth coin we need i+1 index so we need n+1 storage array
        dp[0] = false;// for 0 coin there is no choice to pick anything
        dp[1] = true;// for 1 coin there is one choice
        for (int i = 2; i <= n; i++) {
            if (i - 1 >= 0 && dp[i - 1] == false) {
                dp[i] = true;
            } else if (i - a >= 0 && dp[i - a] == false) {
                dp[i] = true;
            } else if (i - b >= 0 && dp[i - b] == false) {
                dp[i] = true;
            } else {
                dp[i] = false;
            }
        }
        if (dp[n]) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(coinGameWinner(n, a, b));
    }
}
