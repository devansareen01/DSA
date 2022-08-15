// benefits of morris traversal is that it take constant space O(1)and O(N) time
public class morrisTraversal {
    public static void morrisTraversal(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        BinaryTreeNode<Integer> predecessor, curr;/*
                                                   * When you do the inorder traversal of a binary tree,
                                                   * the neighbors of given node are called Predecessor(the node lies
                                                   * behind of given node)
                                                   */
        curr = root;
        while (curr != null) {
            if (curr.left == null) {// when left pointer is null then we print node else we find predescessor and
                                    // attch it with current node
                System.out.print(curr.data + " ");
                curr = curr.right;
            } else {
                /*
                 * Find the inorder
                 * predecessor of current
                 */
                predecessor = curr.left;
                while (predecessor.right != null && predecessor.right != curr)
                    predecessor = predecessor.right;
                /*
                 * Make current as right
                 * child of its
                 * inorder predecessor
                 */
                if (predecessor.right == null) {
                    predecessor.right = curr;
                    curr = curr.left;
                }
                /*
                 * Revert the changes made
                 * in the 'if' part
                 * to restore the original
                 * tree i.e., fix
                 * the right child of predecessor
                 */
                else {
                    predecessor.right = null;
                    System.out.print(curr.data + " ");
                    curr = curr.right;
                }

            }

        }

    }
