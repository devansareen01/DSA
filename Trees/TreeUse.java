
package Trees;

import java.util.Scanner;

public class TreeUse {

    public static TreeNode<Integer> takeInput(Scanner s) {
        int n = s.nextInt();// n is the root data
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        int childCount = s.nextInt(); // child count will tell us how many sub root would make
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput(s);// it subroot is the last then subroot will retun to root and it
                                                   // would be the subroot of our root
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root) {
        String s = root.data + ":"; // in print function we will call first on root then we will call print function
                                    // recursively on subroots
        for (int i = 0; i < root.children.size(); i++) {
            s += root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(s);
        print(root);
    }
}
