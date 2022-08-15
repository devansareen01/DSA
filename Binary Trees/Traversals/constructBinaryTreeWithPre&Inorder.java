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
     public TreeNode buildTreeHelper(int[] preorder,int psi,int pei, int[] inorder,int isi,int iei){
         if(isi > iei)                                                                                  // psi = pre start index
                                                                                                        // pei = pre end index
                                                                                                         // isi = in start index
                                                                                                        // iei = in end index
             return null;
             TreeNode node = new TreeNode(preorder[psi]);
             
             int idx = isi;
             while(inorder [idx] != preorder[psi]); // first element of preorder element is our root because in pre order root is a first element
             idx++;
             
             int cols = idx - isi;// cols = count of left subtree nodes
             
               //root se phele vale left mai sare -- and we can get root in inorder array
             
       node.left =  buildTreeHelper( preorder,psi + 1 ,psi + cols, inorder, isi ,idx - 1);
        // root ke badd vale sare tree ke right mai
       node.right =  buildTreeHelper( preorder, psi + cols + 1, pei, inorder,idx + 1, iei);
         
         
         return node;
         
         ///n
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return buildTreeHelper(preorder,0,n-1,inorder,0,n-1);
        
    }
}n
