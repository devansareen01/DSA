/*
 * @lc app=leetcode id=1343 lang=java
 *
 * [1343] Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
 */

// @lc code=start
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int j = 0;
        int ans = 0;
        int sum = 0;
    int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i - j + 1 == k) {
                if (sum / k >= threshold) {
                    ans++;
                }
                sum = sum - arr[j];
                j++;
            }

        }
        return ans;
    }
}
// @lc code=end
