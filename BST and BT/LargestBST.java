/*************************************************************************

    Following is the class structure of the Node class:

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************************/

 class info{
    int max;
    int min;
    boolean isBST;
    int size;
}

public class Solution {
   
    public static info solve  (TreeNode<Integer> root ){
            // base case
        if(root == null){
            info output = new info();
            output.max = Integer.MIN_VALUE;
            output.min = Integer.MAX_VALUE;
            output.isBST = true;
            output.size = 0;
            return output;
        }
        info left = solve(root.left);
        info right = solve(root.right);
        
        info  currNode = new info();
        currNode.max = Math.max(root.data,Math.max(right.max,left.max));
        currNode.min = Math.min(root.data,Math.min(left.min,right.min));
        
        if(left.isBST && right.isBST && (left.max < root.data && root.data <right.min)) 
            currNode.isBST = true;  
        
        else  currNode.isBST = false;
          if(currNode.isBST){
              currNode.size = left.size +right.size+1;
          }else if(left.size > right.size){
              currNode.size = left.size;// this is the size of largest bst in left not the size of left node
          }else{
              currNode.size = right.size;
          }
        return currNode;
        
    }
	public static int largestBST(TreeNode<Integer> root) {
       return solve(root).size;
	}
}
