class Solution
{
    int getMiddle(Node head)
    {
        Node hare = head;
        Node turtle = head;
        
            while(hare!=null && hare.next != null){
                hare = hare.next.next;
                turtle = turtle.next;// Your code here.
            }
             return turtle.data;
        }
    }
