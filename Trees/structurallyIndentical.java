public class structurallyIndentical {
    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1.children.size() != root2.children.size()) {
            return false;
        }
        for (int i = 0; i < root1.children.size(); i++) {
            if (root1.children.get(i).data != root2.children.get(i).data) {
                return false;
            }
            return (checkIdentical(root1.children.get(i), root2.children.get(i)));

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Give 1st tree input");
        TreeNode<Integer> root1 = TreeUse.takeInput();
        System.out.println("Give 2nd tree input");

        TreeNode<Integer> root2 = TreeUse.takeInput();
        System.out.println(checkIdentical(root1, root2));
    }
}
