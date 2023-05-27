
//User function Template for Java


/*
class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
    
*/
class Solution
{

 
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {
         List<Integer> merged = new ArrayList<>();
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node curr1 = root1;
        Node curr2 = root2;

        while (curr1 != null || curr2 != null || !stack1.isEmpty() || !stack2.isEmpty()) {
            // Traverse BST1 and push all left child nodes onto stack1
            while (curr1 != null) {
                stack1.push(curr1);
                curr1 = curr1.left;
            }

            // Traverse BST2 and push all left child nodes onto stack2
            while (curr2 != null) {
                stack2.push(curr2);
                curr2 = curr2.left;
            }

            // Compare and add the smaller value to the merged list
            if (stack2.isEmpty() || (!stack1.isEmpty() && stack1.peek().data <= stack2.peek().data)) {
                curr1 = stack1.pop();
                merged.add(curr1.data);
                curr1 = curr1.right;
            } else {
                curr2 = stack2.pop();
                merged.add(curr2.data);
                curr2 = curr2.right;
            }
        }

        return merged;
    }
}
