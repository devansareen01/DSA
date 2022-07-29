public class largestThanX {
    public static int largestThanX(TreeNode<Integer> root, int x) {
        if (root == null) {
            return -1;
        }
        int count = 0;
        if (root.data > x) {
            count++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            count += largestThanX(root.children.get(i), x);

        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        System.out.println(largestThanX(root, 100));
    }
}
