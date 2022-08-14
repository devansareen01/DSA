public class removeLeafs {// to be commit on git
    public static BinaryTreeNode removeLeafs(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        root.left = removeLeafs(root.left);
        root.right = removeLeafs(root.right);

        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        removeLeafs(root);
        BinaryTreeUse.print(root);
    }
}
