
public class NoOfNodes {
    public static int numNodes(BinaryTreeNode<Integer> root) {
        int ans = 1;
        if (root == null) {
            return 0;
        }
        ans += numNodes(root.left);
        ans += numNodes(root.right);
        return ans;          
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(numNodes(root));
    }
}
