
class BinaryTree
{
    static int sumBT(Node root){
        //Code
        if(root==null){
            return 0;
        }
        return (root.data+sumBT(root.left)+sumBT(root.right));
       
        
    }
}
