import java.util.Scanner;

//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/goldmine/topic
public class goldMine {
    public static int maxGold(int n, int m, int M[][]) {
        int dp[][] = new int[n][m];
        for (int j = M[0].length - 1; j >= 0; j--) {
            for (int i = M.length - 1; i >= 0; i--) {
                if (j == M[0].length - 1) {
                    dp[i][j] = M[i][j];// last column
                } else if (i == 0) {
                    dp[i][j] = M[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);// first row
                } else if (i == M.length - 1) {// last row
                    dp[i][j] = M[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {// rest of array
                    dp[i][j] = M[i][j] + Math.max(dp[i][j + 1], Math.max(dp[i - 1][j + 1], dp[i + 1][j + 1]));
                }
            }
        }
        int max = dp[0][0];
        for (int i = 0; i < dp.length; i++) {
            if (dp[i][0] > max) {
                max = dp[i][0];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(maxGold(n, m, arr));
    }
}
