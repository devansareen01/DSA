public class sumOfAllNodes {
    public static int sum(TreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        int sum = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int smallAns = sum(root.children.get(i));
            sum += smallAns;
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        System.out.println(sum(root));
    }
}
