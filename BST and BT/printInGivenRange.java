class Solution
{  
    //Function to return a list of BST elements in a given range.
    public static void printNearNodesUtil(Node node, int k1, int k2 , ArrayList<Integer> res)
	{
         
        // base case 
        if (node == null) {
            return;
        }
 
        //if starting range is less than data at current node, we call 
    	//the function recursively for the left subtree.
        if (k1 < node.data)
        {
            printNearNodesUtil(node.left, k1, k2, res);
        }
 
        //if data at current node is within the range given, we store 
    	//the data at current node in the output list.
        if (k1 <= node.data && k2 >= node.data) 
        {
            res.add(node.data);
        }
 
        //if ending range is more than data at current node, we call 
    	//the function recursively for the right subtree.
        if (k2 > node.data) 
        {
            printNearNodesUtil(node.right, k1, k2,res);
        }
    }
    
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
       ArrayList<Integer> result = new ArrayList<Integer>();
       printNearNodesUtil(root,low,high,result);
       return result;
        
    }
    
}
