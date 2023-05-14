class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      
        HashMap<Integer , Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i =nums2.length -1; i>=0;  i--){
            while(!st.isEmpty() && nums2[i] > st.peek()){
                st.pop();
            }

            if(!st.isEmpty()  && nums2[i]< st.peek()){
                map.put( nums2[i], st.peek());
            }else{
                map.put(nums2[i] , -1);
            }
            st.push(nums2[i]);
        }

        int ans[] = new int[nums1.length];
        for(int i =0; i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
    
}
