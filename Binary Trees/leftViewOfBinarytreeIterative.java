/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Pair{
     TreeNode node;
     int level;
     Pair(int level ,TreeNode node){
         this.level = level;
         this.node = node;
     }
 }
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans  = new ArrayList<Integer>();

        if(root == null)
            return ans;
        TreeMap<Integer , Integer> map = new TreeMap<>();

        Queue<Pair> q= new LinkedList<>();    
        
        q.add( new Pair (0 , root));

        while(!q.isEmpty()){
            Pair p = q.poll();

            TreeNode node = p.node;
            int level  = p.level;
            
             if(node.left != null){
                q.add( new Pair (level+1 , node.left));
            }
            if(node.right != null){
                q.add( new Pair (level +1, node.right));
            }

            map.put(level , node.val);
        }

        for(Map.Entry<Integer ,Integer> entry :map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
