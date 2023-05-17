/*
 * @lc app=leetcode id=1695 lang=java
 *
 * [1695] Maximum Erasure Value
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];

            while (map.get(nums[i]) > 1) {
                map.put(nums[j], map.get(nums[j]) - 1);

                sum -= nums[j];
                j++;
            }
            ans = Math.max(ans, sum);
            
        }
        return ans;
    }
}
// @lc code=end
