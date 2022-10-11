import java.util.Scanner;

public class TargetSumSubset {
    // public static boolean isSubsetEqualTarget(int arr[], int target) {
    // boolean dp[][] = new boolean[arr.length + 1][target + 1];

    // for (int i = 0; i < dp.length; i++) {
    // for (int j = 0; j < dp[0].length; j++) {
    // if (i == 0 && j == 0) {
    // dp[i][j] = true;
    // } else if (i == 0) {
    // dp[i][j] = false;
    // } else if (j == 0) {
    // dp[i][j] = true;
    // } else {
    // if (dp[i - 1][j]) {
    // dp[i][j] = true;
    // } else {

    // int val = arr[i - 1];
    // if (j >= val) {
    // if (dp[i - 1][j - val] == true)
    // dp[i][j] = true;
    // }
    // }
    // }
    // }
    // }
    // return dp[dp.length - 1][dp[0].length - 1];
    // }

    // public static void main(String[] args) {
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // int arr[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = scn.nextInt();
    // }
    // int target = scn.nextInt();
    // System.out.println(isSubsetEqualTarget(arr, target));

    // // int target = 10;
    // // System.out.println(isSubsetEqualTarget(arr, target));
    // }
    public static void main(String[] args) throws java.lang.Exception {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t > 0) {
            String str = scn.next();
            int n = scn.nextInt();
            int k = scn.nextInt();
            String ans = "";
            while (k > 0) {
                    
                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (i == 0) {
                        if (ch == '1') {
                            ans += '0';
                        } else if (str.charAt(i + 1) == '0') {
                            ans += '1';
                        }
                    } else {
                        if (ch == '1') {
                            ans += '0';
                        } else if (str.charAt(i + 1) == '0' && ans.charAt(i - 1) == '0') {
                            ans += '1';
                        } else if (str.charAt(i + 1) == '1' && ans.charAt(i - 1) == '0') {
                            ans += '1';

                        } else {
                            ans += 0;
                        }

                    }
                }
                k--;
            }
            System.out.println(ans);
            t--;
        }
    }

}
