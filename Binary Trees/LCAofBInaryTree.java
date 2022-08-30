
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution
{
    //Function to return the lowest common ancestor in a Binary Tree.
	Node lca(Node root, int n1,int n2)
	{
		if(root == null) return null;
		
	
		if(root.data == n1 || root.data == n2) return root; // if root ka data is equal of any one node given for finding LCA then we return root bcz one of the node to root path will our root itself 
	    
	    Node left = lca(root.left ,n1 , n2);
	    Node right = lca(root.right , n1 , n2);
	    
	     if(left == null) return right;
	     if(right == null) return left;
	     else return root;
	     // if we have do not have left null and right null then our root will the LCA bca n1 and n2 wil on right and left sub tree then LCA will only be the  root
	}       
	
}

