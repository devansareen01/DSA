
// } Driver Code Ends


//User function template for JAVA

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node hare = head;
        Node turtle = head;
        
        while(hare.next!=null || hare.next.next!= null){
            hare = hare.next.next;
            turtle= turtle.next;
             if(turtle == hare){
            return true;
          }
        }
        
        return false;
    }
}
