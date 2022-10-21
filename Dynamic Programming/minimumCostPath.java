public class minimumCostPath {
    public class Solution {
        public static int minCostPath(int[][] grid, int x, int y) {
            int dp[][] = new int[x][y];
            for (int i = x - 1; i >= 0; i--) {
                for (int j = y - 1; j >= 0; j--) {
                    if (i == dp.length - 1 && j == dp[0].length - 1) {// end last cell of matrix
                        dp[i][j] = grid[i][j];
                    } else if (i == dp.length - 1) {// at last row
                        dp[i][j] = dp[i][j + 1] + grid[i][j];
                    } else if (j == dp[0].length - 1) {// at last column
                        dp[i][j] = dp[i + 1][j] + grid[i][j];
                    } else {// rest part of matrix
                        dp[i][j] = Math.min(Math.min(dp[i][j + 1], dp[i + 1][j + 1]), dp[i + 1][j]) + grid[i][j];
                    }
                }
            }
            return dp[0][0];
        }

    }
}
