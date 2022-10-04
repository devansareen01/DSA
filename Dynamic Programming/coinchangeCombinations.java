import java.io.*;
import java.util.*;

public class coinchangeCombinations {
    public static long count(int coins[], int N, int sum) {
        long dp[] = new long[sum + 1];
        dp[0] = 1;// every element itself have one combination jaise 2^0 is 1
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j < dp.length; j++) {// one thing we can notice here is that we are going through
                                                        // coins array one by one element beacuse we want combinations
                dp[j] += dp[j - coins[i]];// we will check in our dp how many combination already of jth number is
                                          // present
            }
        }
        return dp[sum];// returing final ans index in our dp
    }

    // storage and meaning -->> every cell contain that current cell contian how
    // many combinations
    // direction--->> small problem on 0th index as it have 1 combination and big
    // problem is on last index that is large probelem,so we go left to right
    // travel and solve-->>travel each cell and maintian sum of combinations
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(count(arr, arr.length, target));
    }
}
