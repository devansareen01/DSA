public class doubleTree {
    public static void doubleTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        BinaryTreeNode<Integer> oldLeft;

        doubleTree(root.left);
        doubleTree(root.right);
        oldLeft = root.left;
        root.left = new BinaryTreeNode<Integer>(root.data);
        root.left.left = oldLeft;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        doubleTree(root);
        BinaryTreeUse.print(root);
    }
}
