
public class checkBST3 {
    public static boolean helper(BinaryTreeNode<Integer> root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data < min || root.data > max) {
            return false;
        }
        return helper(root.left, min, root.data - 1) && helper(root.right, root.data, max);
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(isBST(root));
    }

}
