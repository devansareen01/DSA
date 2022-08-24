import java.util.ArrayList;

public class rootToNodePath {
    public static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput = rootToNodePath(root.left, data);
        if (leftOutput != null) {

            leftOutput.add(root.data);
            return leftOutput;
        }
        ArrayList<Integer> rightOutput = rootToNodePath(root.right, data);
        if (rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(rootToNodePath(root, 6));
    }
}
