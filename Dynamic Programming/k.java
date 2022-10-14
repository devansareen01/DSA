import java.util.*;

public class k {
    public static int zerOneKnapSnack(int[] vals, int[] wts, int cap) {
        int dp[][] = new int[vals.length + 1][cap + 1];// no.of columns will be values or wts's length+1 beacuse (0,0)
                                                       // will have nothing to store in it
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (j >= wts[i - 1]) {
                    if (dp[i - 1][j - wts[i - 1]] + vals[i - 1] > dp[i - 1][j]) {// this is the case if current team bat
                                                                                 // if they are batting then we comare
                                                                                 // previous teams run and how much
                                                                                 // current team can score
                        dp[i][j] = dp[i - 1][j - wts[i - 1]] + vals[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];// this is the case if team does't bat then we will store run of only
                                                // previous team
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[vals.length][cap];
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] vals = new int[n];
        for (int i = 0; i < n; i++) {
            vals[i] = scn.nextInt();
        }
        int[] wts = new int[n];
        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }
        int cap = scn.nextInt();
        System.out.println(zerOneKnapSnack(vals, wts, cap));
    }
}
