import java.util.ArrayList;
import java.util.Scanner;

public class maximumAreaSquare {
    public static int maxSquare(int n, int m, int mat[][]) {
        int ans = 0;
        int dp[][] = new int[mat.length][mat[0].length];
        if (dp.length == 1 || dp[0].length == 1) {// if there is only one  row or one column  then sqaure size will always 1
            return 1;

        }
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {// at last coloumn and last row there will only 1 size of sqaure always
                if (i == dp.length - 1 || j == dp[0].length - 1) {
                    dp[i][j] = mat[i][j];
                } else {
                    if (mat[i][j] == 0) {
                        dp[i][j] = 0;
                    } else {
                        int min = Math.min(dp[i][j + 1], Math.min(dp[i + 1][j], dp[i + 1][j + 1]));//taking min of all three sides give us that value around is 0 or 1

                        dp[i][j] = min + 1;
                        if (dp[i][j] > ans) {
                            ans = dp[i][j];
                        }
                    }

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        System.out.println(maximumAreaSquare(arr, n, m));
    }
}
