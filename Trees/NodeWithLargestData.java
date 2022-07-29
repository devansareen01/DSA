import java.util.Scanner;

public class largest {
    public static TreeNode<Integer> takeInput() {

        System.out.println("Enter root data");
        Scanner scn = new Scanner(System.in);
        // firstly we will take input of root and enque it in a que
        // 2 when we take input of children of root levelwise we will deque root from
        // que
        int rootData = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            try {
                TreeNode<Integer> frontNode = pendingNodes.dequeue();
                System.out.println("Enter the number of child of" + " " + frontNode.data);
                int childCount = scn.nextInt();
                for (int i = 0; i < childCount; i++) {
                    System.out.println("Enter the data of" + " " + (i + 1) + "th child of" + " " + frontNode.data);
                    int child = scn.nextInt();
                    TreeNode<Integer> childNode = new TreeNode<>(child);
                    frontNode.children.add(childNode);
                    pendingNodes.enqueue(childNode);
                }
            } catch (queueEmptyException e) {
                // should not come here
                return null;
            }
        }
        return root;
    }

    public static int largest(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int smallAns = largest(root.children.get(i));
            if (ans < smallAns) {
                ans = smallAns;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        System.out.println(largest(root));
    }
}
