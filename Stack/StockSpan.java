import java.util.Stack;
public class Solution {
    
    public static int[] findStockSpans(int[] prices) {
        Stack<Integer> s = new Stack<>();
        int span[] = new int[prices.length];
        s.push(0);
        span[0] = 1;
        for (int i = 1; i < prices.length; i++) {

            while (s.size() > 0 && prices[i] > prices[s.peek()]) {
                s.pop();
            }

            if (s.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }
            s.push(i);
        }

        return span;
    }
}
