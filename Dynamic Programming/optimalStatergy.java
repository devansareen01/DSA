import java.util.Scanner;

public class optimalStatergy {
    public static void optimalStrategy(int[] arr) {
        int dp[][] = new int[arr.length][arr.length];
        for (int g = 0; g < dp.length; g++) {
            for (int i = 0, j = g; j < dp.length; i++, j++) {
                if (g == 0) {
                    dp[i][j] = arr[i];
                } else if (g == 1) {
                    dp[i][j] = Math.max(arr[i], arr[j]);
                } else {// we are assuming that oponent will left a minimum value for us
                    int option1 = arr[i] + Math.min(dp[i + 2][j], dp[i + 1][j - 1]);// i-->i+1,j  if i+1 -->i+2,j or j -->i+1,j-1
                    int option2 = arr[j] + Math.min(dp[i + 1][j - 1], dp[i][j - 2]);// j -->i,j-1 if i-->i+1,j-1 or j-1-->i,j-2
                    int finalOption = Math.max(option1, option2);
                    dp[i][j] = finalOption;
                }
            }
        }
        System.out.println(dp[0][dp.length - 1]);

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        optimalStrategy(a);
    }
}
