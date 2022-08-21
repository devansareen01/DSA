/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBSTcons(int[] nums,int si ,int ei ){
        
      int mid = (si + ei) / 2;
        if(si>ei){ // si = starting index and ei = ending index
            return null;
        }
        
          
            TreeNode root = new TreeNode(nums[mid]);
        
        
        root.left = sortedArrayToBSTcons(nums , si ,mid -1);
        root.right = sortedArrayToBSTcons(nums , mid+1 ,ei);
        return root;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTcons(nums,0,nums.length-1);
    }
}
