import java.util.Scanner;

//https://www.youtube.com/watch?v=BzTIOsC0xWM&t=903s- resource
public class minCost {
    

    public static int minPathSum(int[][] grid) {
        int dp[][] = new int[grid.length][grid[0].length];
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (i == dp.length - 1 && j == dp[0].length - 1) {// end last cell of matrix
                    dp[i][j] = grid[i][j];
                } else if (i == dp.length - 1) {// at last row
                    dp[i][j] = dp[i][j + 1] + grid[i][j];
                } else if (j == dp[0].length - 1) {// at last column
                    dp[i][j] = dp[i + 1][j] + grid[i][j];
                } else {// rest part of matrix
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + grid[i][j];
                }
            }
        }
        return dp[0][0];
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
        System.out.println(minPathSum(arr));
    }
}
