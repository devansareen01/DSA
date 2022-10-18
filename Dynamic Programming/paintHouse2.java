import java.util.Scanner;

public class paintHouse2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();// no. of houses
        int c = scn.nextInt();// no. of colours
        int arr[][] = new int[n][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        int dp[][] = new int[n][c];
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;// second max
        for (int i = 0; i < c; i++) {
            dp[0][i] = arr[0][i];
            if (arr[0][i] <= min) {// if curr ele will smaller than min
                smin = min;// then update small min and min both
                min = arr[0][i];
            } else if (arr[0][i] <= smin) {// else if it smaller than secondmin only then update secondmin only
                smin = arr[0][i];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            int nmin = Integer.MAX_VALUE;
            int nsmin = Integer.MAX_VALUE;
            for (int j = 0; j < dp[0].length; j++) {
                if (dp[i - 1][j] == min) {
                    dp[i][j] = smin + arr[i][j];
                } else {
                    dp[i][j] = min + arr[i][j];
                }
                if (dp[i][j] <= nmin) {// if curr ele will smaller than min
                    nsmin = nmin;// then update small min and min both
                    nmin = dp[i][j];
                } else if (dp[i][j] <= nsmin) {// else if it smaller than secondmin only then update secondmin only
                    nsmin = dp[i][j];
                }
            }
            min = nmin;
            smin = nsmin;
        }

        System.out.println(min);
    }
}
