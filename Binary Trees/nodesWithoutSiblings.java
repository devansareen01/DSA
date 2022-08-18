import java.util.ArrayList;

public class nodesWithoutSiblings {
    public static void nodesWithoutSiblings(BinaryTreeNode<Integer> root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return;
        }
        if (root.left != null && root.right == null || root.right != null && root.left == null) {
            if (root.left != null) {
                System.out.print(root.left.data + " ");

            } else {
                System.out.print(root.right.data + " ");

            }
        }

        nodesWithoutSiblings(root.left);
        nodesWithoutSiblings(root.right);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        nodesWithoutSiblings(root);
    }
}
