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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
            return null;
        if(root.val == key)
            return helper(root);
        TreeNode temp = root;

        while(root != null){
        if(root.val > key){
            if(root.left != null && root.left.val == key){
            root.left =   helper(root.left );
                break;
            }

            else
                root = root.left;
        }
        else{
            if(root.right != null && root.right.val == key){
            root.right = helper(root.right);
                break;
            }
            else
                root = root.right;
            }
        }
        return temp;
    }

    public TreeNode helper(TreeNode root){
        if(root.left == null)
            return root.right;
        if(root.right == null)
            return root.left;
        TreeNode rightChild = root.right;
        TreeNode lastRightOfLeft = findLastRight(root.left);
        lastRightOfLeft.right = rightChild;
        return root.left;
    }
    public TreeNode findLastRight( TreeNode node){
        if(node.right == null)
            return node;
        return findLastRight(node.right);
    }
}
