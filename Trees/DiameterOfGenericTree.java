public class diameterOFTree {
    static int dia = 0;

    // travel and change rule
    public static int calculateDiameterReturnHeight(TreeNode<Integer> root) {
        int dch = -1;// dpc = deepest child height
        int sdch = -1;/// second deepest child height
        for (int i = 0; i < root.children.size(); i++) {
            int ch = calculateDiameterReturnHeight(root.children.get(i));
            // ch = child height
            if (ch > dch) {
                sdch = dch;
                dch = ch;
            } else if (ch > sdch) {
                sdch = ch;
            }
        }
        if (dch + sdch + 2 > dia) {
            dia = dch + sdch + 2;// deepest node height + second deepest height+ 2 edges of root
        }
        dch += 1;
        return dch;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        calculateDiameterReturnHeight(root);
        System.out.println(dia);
    }
}
