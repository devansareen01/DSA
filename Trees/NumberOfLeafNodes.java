
public class leafNodes {
    public static int numOfLeaf(TreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }

        if (root.children.size() == 0) {
            return 1;
        }
        int size = 0;
        for (int i = 0; i < root.children.size(); i++) {
            size += numOfLeaf(root.children.get(i));
        }
        return size;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        System.out.println(numOfLeaf(root));
    }
}
