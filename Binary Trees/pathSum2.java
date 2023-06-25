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
        List<List<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();
        public void helper(TreeNode root , int targetSum  ){
            if(root == null){
                return;
            }
            arr.add(root.val);
          
            if(root.left == null && root.right == null){
                    if( targetSum - root.val == 0){
                        
                        ans.add(new ArrayList<>(arr));
                       
                    }
              
            }
            helper(root.left , targetSum - root.val );

            helper( root.right , targetSum - root.val );
            arr.remove(arr.size()-1);
             
        }

        
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        

        helper( root ,  targetSum );

        return ans;
    }
}
