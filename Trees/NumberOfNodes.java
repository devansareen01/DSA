import java.util.Scanner;

public class numberOfNodes {
    public static int numNodes(TreeNode<Integer> root) {
        if(root == null){
            return 0;
        }
        int count = 1;

        for (int i = 0; i < root.children.size(); i++) {
            count += numNodes(root.children.get(i));
        }
        return count;
    }

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

  

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        System.out.println(numNodes(root));
    }
}
