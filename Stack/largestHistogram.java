class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        
        Stack<Integer> st = new Stack<>();
        
        int rb[] = new int[n] ;// next smaller on right
          int lb[] = new int[n]; // next smaller on left
        
        rb[n-1] = n-1;
        st.push(n-1);
        
        for(int i = n-2; i>=0; i--){
            
            while(!st.isEmpty() && heights[i] <= heights[st.peek()] )
                    st.pop();
            
            if(st.isEmpty())
                rb[i] = n-1;
            else
                rb[i] = st.peek()-1;
            st.push(i);
        }
        
        // clear stack for reuse
        while(!st.isEmpty())
            st.pop();
        
         lb[0] = 0;
        st.push(0);
        
        for(int i = 1; i<n; i++){
            
            while(!st.isEmpty() && heights[i] <= heights[st.peek()] )
                    st.pop();
            
            if(st.isEmpty())
                lb[i] = 0;
            else
                lb[i] = st.peek()+1;
            st.push(i);
        }
            
      
            
        int maxArea = Integer.MIN_VALUE;
        
        for(int i =0; i<n ;i++){
            int width = rb[i] - lb[i]+1  ;
            int area = heights[i] * width;
            maxArea = Math.max(area , maxArea);
        }
        return maxArea;
    }
}
