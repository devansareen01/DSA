public class isPresent {
    public static boolean isPresent(TreeNode<Integer> root, int x) {
        if (root == null) {
            return false;
        }
        if (root.data == x) {
            return true;
        }
        for (int i = 0; i < root.children.size(); i++) {
            if (root.children.get(i).data == x) {
                return true;
            }
            isPresent(root.children.get(i), x);

        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        System.out.println(isPresent(root, 20));
    }
}
