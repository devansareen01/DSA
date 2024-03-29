
public class BST {
    private BinaryTreeNode<Integer> root;

    private boolean helperhasData(int data, BinaryTreeNode<Integer> root) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (root.data > data) {
            return helperhasData(data, root.left);
        }

        else {
            return helperhasData(data, root.right);
        }
    }

    private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
        // best thing to do it in iterative way is that i take O(1) constant space
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> curr = root, parent = null;// we have to remain two refrences parent and curr
        while (curr != null) {
            parent = curr;
            if (data < curr.data) {
                curr = curr.left;
            } else if (data > curr.data) {
                curr = curr.right;
            } else {
                return root;
            }

        }
        if (parent == null) {// this is the exceptional case when someone passes you an empty BST
            return temp;
        }
        if (data < parent.data) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
        return root;
    }

    public void insert(int data) {

        root = insertHelper(root, data);
    }

    public boolean hasData(int data) {
        return helperhasData(data, root);
    }

    public void delete(int data) {
        root = deleteHelper(root, data);
    }

    private BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root, int X) {
        if (root == null) {
            return null;
        }
        if (X < root.data) {
            root.left = deleteHelper(root.left, X);

        } else if (X > root.data) {
            root.right = deleteHelper(root.right, X);
        }

        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            else {
                BinaryTreeNode<Integer> succ = root.right;
                while (succ != null && succ.left != null) {
                    succ = succ.left;
                }
                root.data = succ.data;
                root.right = deleteHelper(root.right, succ.data);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        BST root = new BST();
        root.insert(10);
        root.insert(20);
        root.insert(30);
        root.insert(40);
        root.insert(50);
        System.out.println(root.hasData(10));
        root.delete(20);
        System.out.println(root.hasData(20));

    }

}
