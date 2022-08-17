
public static ArrayList<Integer> zigzagLevelOrderTraversal(TreeNode root)   
{  
// storing the element that has been traversed during zigzag traversal   
ArrayList<Integer> keep = new ArrayList<Integer>();  
Queue<TreeNode> nodes = new LinkedList<TreeNode>();  
// the stack will be used when we traverse from left to right  
// and the stored nodes will be used when we traverse from right to left  
Stack<TreeNode> currentLevelNodes = new Stack<TreeNode>();  
nodes.add(root);  
// the value of l to r (left to right)   
// will vary from 0 to 1  
int ltor = 1;  
while (!nodes.isEmpty())   
{  
if (ltor == 1)   
{  
int size = nodes.size();  
for (int j = 0; j < size; j++)   
{  
TreeNode currNode = nodes.peek();  
nodes.poll();  
keep.add(currNode.val);  
if (currNode.left != null)   
{  
nodes.add(currNode.left);  
// adding nodes to the stack  
currentLevelNodes.push(currNode.left);  
}  
if (currNode.right != null)   
{  
nodes.add(currNode.right);  
// adding nodes to the stack  
currentLevelNodes.push(currNode.right);  
}  
}  
}   
else   
{  
int size = nodes.size();  
for (int j = 0; j < size; j++)   
{  
TreeNode currentNode = nodes.peek();  
nodes.poll();  
// using the stored nodes  
keep.add(currentLevelNodes.peek().val);  
currentLevelNodes.pop();  
if (currentNode.left != null)   
{  
nodes.add(currentNode.left);  
}  
if (currentNode.right != null)   
{  
nodes.add(currentNode.right);  
}  
}  
}  
// toggling between 0 & 1  
ltor = 1 - ltor;  
}  
return keep;  
}  
