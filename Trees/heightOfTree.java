
public class heightOfTree {
    public static int height(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int height = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int smallAns = height(root.children.get(i));
            if (smallAns > height) {
                height = smallAns;
            }

        }
        return height + 1;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        System.out.println("Height of given tree is " + height(root));
    }

}
