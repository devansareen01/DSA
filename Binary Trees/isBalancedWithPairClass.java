/*public class BalPair {
    int ht;
    boolean isBal;
}/* */

public class isBalancedWithPairClass {

    public static BalPair isBal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            BalPair bp = new BalPair();
            bp.ht = 0;
            bp.isBal = true;
            return bp;
        }
        BalPair lp = isBal(root.left);
        BalPair rp = isBal(root.right);

        BalPair mp = new BalPair();
        mp.isBal = Math.abs(lp.ht - rp.ht) <= 1 && lp.isBal && rp.isBal;
        mp.ht = Math.max(lp.ht, rp.ht) + 1;
        return mp;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
        System.out.println(isBal(root).isBal);
        System.out.println(isBal(root).ht);
    }

}
