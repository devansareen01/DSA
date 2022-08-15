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
// using morris traversal with constant space
class Solution {
    public void flatten(TreeNode root) {
        TreeNode  curr = root;
        
        while(curr!= null){
            if(curr.left!= null){
                TreeNode pre = curr.left;
                while(pre.right!=null){
                    pre= pre.right;
                }
                pre.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
