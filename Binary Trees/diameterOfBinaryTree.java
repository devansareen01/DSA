/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {
  static   int ans = 0;
	public static int  diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        getDiameter(root);
        return ans==0?0:ans-1;
            
    
	}
    public static int getDiameter(BinaryTreeNode<Integer> root){
        if(root ==null){
            return 0;
        }
        int l = getDiameter(root.left);
        int r = getDiameter(root.right);
        ans = Math.max(ans,(l+r+1));
        return Math.max(l,r)+1;
    }
	
}
