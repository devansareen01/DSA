

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
        BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(data);
        BinaryTreeNode<Integer> curr = root, parent = null;
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
        if (parent == null) {
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

    public static void main(String[] args) {
        BST root = new BST();
        root.insert(10);
        root.insert(20);
        root.insert(30);
        root.insert(40);
        root.insert(50);
        System.out.println(root.hasData(50));

    }

}
