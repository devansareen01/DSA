public class nodeWithMaximumSubTreeSum {
    static int msn = 0;
    static int ms = Integer.MIN_VALUE;

    public static int returnMaxSubTreeSum(TreeNode<Integer> root) {
        int sum = 0;
        for (int i = 0; i < root.children.size(); i++) {
            int cms = returnMaxSubTreeSum(root.children.get(i));
            sum += cms;
        }
        sum += root.data;
        if (sum > ms) {
            ms = sum;
            msn = root.data;
        }
        return sum;

    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInput();
        returnMaxSubTreeSum(root);// travel and change stratergy// calculating some thing else
        System.out.println(msn);// and returning something else
    }
}
