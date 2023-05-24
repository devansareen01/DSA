import java.util.* ;
import java.io.*; 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode < Integer > {
        int data;
        BinaryTreeNode < Integer > left;
        BinaryTreeNode < Integer > right;

    public BinaryTreeNode(int data) {
            this.data = data;
        }
    }

*************************************************************/

public class Solution {
    public static void changeTree(BinaryTreeNode < Integer > root) {
       if(root == null)
            return;
        
        int child = 0;
        if(root.left != null)
            child += root.left.data;
        if(root.right != null)
            child += root.right.data;

        if(child >=root.data )
            root.data = child;
        else{
            if(root.left != null)
                root.left.data = root.data;
            else if(root.right != null)
                    root.right.data = root.data;
        }   
        changeTree(root.left);
        changeTree(root.right);

        int tol = 0;
        if(root.left != null)
            tol+=root.left.data;
        if(root.right != null)
            tol +=root.right.data;
        if(root.left !=null || root.right!= null)
            root.data = tol;
    }
}
