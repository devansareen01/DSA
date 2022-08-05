
public class TreeTraversal {
    public static void preorder(TreeNode<Integer> root) {// in pre order firslty root's data will be printed then children's data
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        for (int i = 0; i < root.children.size(); i++) {
            preorder(root.children.get(i));
        }
    }

    public static void postorder(TreeNode<Integer> root) {// in post order firstly children's data will be printed after then root's data
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
        }
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        System.out.print("Pre oder = ");
        preorder(root);
        System.out.println();
        System.out.print("Post order = ");
        postorder(root);
        System.out.println();
    }
}
