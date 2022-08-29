import java.util.LinkedList;
import java.util.Queue;

public class nextRight {
    public static BinaryTreeNode<Integer> nextRight(BinaryTreeNode<Integer> root, int key) {
        BinaryTreeNode<Integer> ans = new BinaryTreeNode<Integer>(-1);

        if (root == null)
            return null;
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            q.poll();

            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
            if (q.isEmpty())
                return ans;
            if (q.peek().data == key) {
                q.poll();
                return q.peek();

            }
        }
        return null;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(nextRight(root, 1).data);
    }
}
