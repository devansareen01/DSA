class Solution {
    public int[] nextGreaterElements(int[] nums1) {

        int n = nums1.length;
         Stack<Integer> st = new Stack<>();
         int ans[] = new int[nums1.length];
        for(int i =2*nums1.length -1; i>=0;  i--){
            while(!st.isEmpty() && nums1[i%n] >= st.peek()){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()){
                    ans[i%n] = st.peek();
                }else{
                    ans[i%n] = -1;
                }
            }
            st.push(nums1[i%n]);
        }

       
      
        return ans;
    }
}
