/************************************************************

 Following is the TreeNode class structure
     class TreeNode<T>
     {
         public:
             T data;
             TreeNode<T> left;
             TreeNode<T> right;

            TreeNode(T data)
            {
                this.data = data;
                left = null;
                right = null;
         }
     };
 ************************************************************/
public class Solution
{
    static TreeNode<Integer> prev;
  
    public static void Inorder(TreeNode<Integer>root){
    if(root == null){
        return;
    }
     Inorder(root.left);
        prev.left = null;//inorder traversal will flatten the tree in sorted form
        prev.right = root;
        prev = root;// prev will be our curr node now
        Inorder(root.right);//
    }
    public static TreeNode<Integer> flatten(TreeNode<Integer> root)
    {
        TreeNode<Integer> dummy = new TreeNode<Integer>(-1);
        prev = dummy;
        Inorder(root);
        
        prev.left = null;
        prev.right = null;
        TreeNode<Integer> result = dummy.right;
        return result;
    }
}
