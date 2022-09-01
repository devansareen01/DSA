/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data) 
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

import java.util.ArrayList;

public class Solution 
    
{
    public static void kNodeDown(TreeNode<Integer> root, int k, TreeNode blocked, ArrayList<Integer> ans) {
        if (root == null || k < 0 || root == blocked)
            return;

        if (k == 0) {

            ans.add(root.data);
            return;
        }
        kNodeDown(root.left, k - 1, blocked, ans);
        kNodeDown(root.right, k - 1, blocked, ans);
    }

    public static int distanceK(TreeNode<Integer> root, int target, int k, ArrayList<Integer> ans) {
        if (root == null)
            return -1;

        if (root.data == target) {
            kNodeDown(root, k - 0, null, ans);
            return 1;
        }

        int ld = distanceK(root.left, target, k , ans);
        if (ld != -1) {
            kNodeDown(root, k - ld, root.left, ans);
            return ld + 1;
        }

        int rd = distanceK(root.right, target, k , ans);
        if (rd != -1) {
            kNodeDown(root, k - rd, root.right, ans);
            return rd + 1;
        }
        return -1;
    }

    public static ArrayList<Integer> kDistance(TreeNode<Integer> root, int target, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        distanceK(root, target, k, ans);
        return ans;

    }
}
