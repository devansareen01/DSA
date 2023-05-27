/* BST Node

class Node
{
	int key;
	Node left, right;
	
	Node(int item)
	{
	    data = item;
	    left = right = null;
	}
}
*/

// This function finds predecessor and successor of key in BST.
// It sets pre and suc as predecessor and successor respectively
class GfG
{
    public static void findSucc(Node root, Res s , int key){
        s.succ = null;
        Node temp = root;
        while(temp != null){
            if(key >=  temp.data){
                temp = temp.right;
            }else{
                s.succ = temp;
                temp = temp.left;
            }
        }
    }
    
     public static void findPree(Node root, Res p , int key){
        p.pre = null;
        Node temp = root;
        while(temp != null){
            if(key >  temp.data){
                p.pre = temp;
                temp = temp.right;
            }else{
                
                temp = temp.left;
            }
        }
    }
  
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
        
       findPree( root , p , key);
       findSucc(root , s , key);
    }
}
