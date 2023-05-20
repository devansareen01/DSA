import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the Binary Tree node structure:
    
   class TreeNode {
	    int data;
	    TreeNode left;
	    TreeNode right;

	    TreeNode(int data) {
		    this.data = data;
		    this.left = null;
		    this.right = null;
	    }

    }

************************************************************/

import java.util.ArrayList;



public class Solution {
	public  static void addLeftBoundary(TreeNode node , ArrayList<Integer> ans){
        if (node == null)
            return;
        TreeNode cur = node.left;
        while(cur!=null){
            if(!isLeaf (cur ))
                ans.add(cur.data);
            if(cur.left != null) 
                cur = cur.left;
            else
                cur = cur.right;
        }
        
    }
    
   public static void addRightBoundary(TreeNode node , ArrayList<Integer> ans){
        if (node == null)
            return;
        TreeNode cur = node.right;
        Stack<Integer> st = new Stack<>();
        while( cur!= null){
            if(!isLeaf (cur))
                st.push(cur.data);
            if(cur.right != null)
                cur= cur.right;
            else
                cur = cur.left;
        }
        while(!st.isEmpty()){
            ans.add(st.peek());
            st.pop();
        }
    }
    
	public static void addLeaves(TreeNode node , ArrayList<Integer> ans){
        
        if (node == null)
            return;
        
        if(isLeaf (node)){
            ans.add(node.data);
            return;
        }            
        addLeaves(node.left , ans);
        addLeaves(node.right , ans);
    }
    
    public static boolean isLeaf(TreeNode node){
        return node.left==null && node.right == null;
    }
	public static  ArrayList<Integer> traverseBoundary(TreeNode node){
		ArrayList<Integer> ans = new ArrayList<>();
	    
	    if(node == null) return ans;
	    
	    if(!isLeaf( node)) {
	        ans.add(node.data);
	    }
	    addLeftBoundary( node , ans);
	    
	    addLeaves(node ,ans);
	    
	    addRightBoundary(node , ans);
	    return ans;
	  
	}
}
