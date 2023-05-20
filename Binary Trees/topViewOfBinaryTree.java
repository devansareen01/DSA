import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure:

    class BinaryTreeNode {
		int val;
		BinaryTreeNode left;
		BinaryTreeNode right;

		BinaryTreeNode(int val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

************************************************************/

class Pair{
    int ver;
    BinaryTreeNode node;
    Pair(int ver , BinaryTreeNode node){
        this.ver = ver;
        this.node = node;
    }
}
public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer , Integer> map = new TreeMap<>();
        
        Queue<Pair> q= new LinkedList<>();
        
        if(root == null) return ans;
        q.add(new Pair (0 , root));
        
        while(!q.isEmpty()){
            Pair  p = q.poll();
            BinaryTreeNode node = p.node;
            int ver = p.ver;
            
            
            if(node.left != null)
                q.add( new Pair(  ver-1,node.left ));
                
            if(node.right != null)
                q.add( new Pair( ver+1 , node.right));
            
            if(map.get(ver) == null)
                map.put(ver , node.val );
        }
        
        for(Map.Entry<Integer , Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
	}
}
