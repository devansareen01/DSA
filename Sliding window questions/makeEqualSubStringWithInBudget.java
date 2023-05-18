/*
* @lc app=leetcode id=1208 lang=java
*
* [1208] Get Equal Substrings Within Budget
*/

// @lc code=start
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int j = 0;
        int cost = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            cost += Math.abs(s.charAt(i) - t.charAt(i));

            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(j) - t.charAt(j));
                j++;
            }
            ans = Math.max(i - j + 1, ans);
        }
        return ans;
    }
}
// @lc code=end
