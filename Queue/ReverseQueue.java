import java.util.Queue;

public class Solution {
    public static void reverse(Queue < Integer > q) {
        // Write your code here.
        if(q.isEmpty()){
            return;
        }
        int x = q.peek();
        q.remove();
        reverse(q);
        q.add(x);
        }
    
}
