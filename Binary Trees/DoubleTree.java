public class doubleTree {
    public static void doubleTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        BinaryTreeNode<Integer> oldLeft;

        doubleTree(root.left);
        doubleTree(root.right);
        oldLeft = root.left;// storing the reference of left
        root.left = new BinaryTreeNode<Integer>(root.data);// connecting duplicate node to left
        root.left.left = oldLeft;// updating olf left node at right position
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        doubleTree(root);
        BinaryTreeUse.print(root);
    }
}
