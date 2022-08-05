import java.util.Scanner;

public class BinaryTreeUse {
    public static BinaryTreeNode<Integer> takeInput() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter root data");
        int rootData = scn.nextInt();
        if (rootData == -1) {// if user enter -1 means there is no child of this node
            return null;
        }
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        pendingNodes.enqueue(root);
        BinaryTreeNode<Integer> front;
        while (!pendingNodes.isEmpty()) {
            try {
                front = pendingNodes.dequeue();
            } catch (queueEmptyException e) {
                return null;
            }
            System.out.println("Enter the left child of " + front.data);
            int leftChild = scn.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }

            System.out.println("Enter the right child of " + front.data);
            int rightChild = scn.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void print(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }

        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);
        BinaryTreeNode<Integer> front;
        while (!pendingNodes.isEmpty()) {

            try {
                front = pendingNodes.dequeue();
            } catch (queueEmptyException e) {
                return;
            }
            String s = front.data + ":";
            if (front.left != null) {
                pendingNodes.enqueue(front.left);
                s += "L" + front.left.data;
            }
            if (front.right != null) {
                pendingNodes.enqueue(front.right);
                s += " " + "R" + front.right.data;
            }

            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInput();
        print(root);
    }
}
