
public class checkBST {

    // Function to check whether a Binary Tree is BST or not.

    public static int maximum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
    }

    public static int minimum(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }

        int leftMax = maximum(root.left);
        int rightMin = minimum(root.right);

        if (leftMax >= root.data || rightMin < root.data) {
            return false;
        }
        if (isBST(root.left) && isBST(root.right)) {

            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(isBST(root));
    }
}
