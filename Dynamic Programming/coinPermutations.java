import java.util.Scanner;

public class coinPermutations {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(coinPermutations(arr, target));
    }

    public static int coinPermutations(int coins[], int target) {
        int dp[] = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {        // amount should be less than equal to  coins  
                    dp[i] += dp[i - coins[j]];
                }
            }
        }
        return dp[target];
    }

}
