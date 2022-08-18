import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class zigzagTree {
    public static ArrayList<Integer> zigzagLevelOrder(BinaryTreeNode<Integer> root) 
        if (root == null) {
            return null;
        }
        ArrayList<Integer> keep = new ArrayList<Integer>();
        Queue<BinaryTreeNode<Integer>> nodes = new LinkedList<BinaryTreeNode<Integer>>();

        Stack<BinaryTreeNode<Integer>> currentLevelNodes = new Stack<BinaryTreeNode<Integer>>();
        nodes.add(root); // adding root node to stack

        int ltor = 1; // left to right counter
        // size of
        while (!nodes.isEmpty()) {  // when we are goint left to right add nodes in both in stack as well as in queue
            if (ltor == 1) {
                int size = nodes.size();
                for (int i = 0; i < size; i++) {

                    BinaryTreeNode<Integer> currNode = nodes.peek();
                    nodes.poll();
                    currentLevelNodes.push(currNode);
                    keep.add(currentLevelNodes.pop().data);//going left to right add elements whatever on peek of queue
                    if (currNode.left != null) {
                        nodes.add(currNode.left);
                        currentLevelNodes.push(currNode.left);
                    }
                    if (currNode.right != null) {
                        nodes.add(currNode.right);
                        currentLevelNodes.push(currNode.right);
                    }
                }
            } else {
                int size = nodes.size();
                for (int j = 0; j < size; j++) {
                    BinaryTreeNode currNode = nodes.peek();// when we are going from right  to left  only add nodes in queue
                    nodes.poll();

                    keep.add(currentLevelNodes.pop().data);//going right to left add elments whatever on peek of stack
                    // currentLevelNodes.pop();

                    if (currNode.left != null) {
                        nodes.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        nodes.add(currNode.right);
                    }
                }
            }
            ltor = 1 - ltor;// it will toggle at every traversal
        }

        return keep;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(zigzagLevelOrder(root));
    }
}
