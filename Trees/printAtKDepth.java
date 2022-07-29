public class depthOfNode {
    public static void printAtK(TreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k < 0) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printAtK(root.children.get(i), k - 1);
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        printAtK(root, 2);
    }
}
