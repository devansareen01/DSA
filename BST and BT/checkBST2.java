/*public class Triplet {
    int min;
    int max;

    boolean isBSt;

}*/

public class checkBST2 {
    public static Triplet checkBST(BinaryTreeNode<Integer> root) {
        if (root == null) {

            Triplet output = new Triplet();
            output.min = Integer.MAX_VALUE;
            output.max = Integer.MIN_VALUE;
            output.isBSt = true;
            return output;
        }

        Triplet leftOutput = checkBST(root.left);
        Triplet rightOutput = checkBST(root.right);
        Triplet output = new Triplet();
        output.min = Math.min(root.data, Math.min(leftOutput.min, rightOutput.min));
        output.max = Math.max(root.data, Math.max(leftOutput.max, rightOutput.max));
        output.isBSt = root.data > leftOutput.max && root.data <= rightOutput.min && leftOutput.isBSt
                && rightOutput.isBSt;
        return output;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(checkBST.isBST(root));
    }
}
