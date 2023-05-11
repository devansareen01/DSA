class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int count =0;
       int start =0;
       int end = 0;
       int odd =0;
        int ans =0;
       while(end < nums.length){
           if(nums[end] %2 !=0){
               odd++;
               count =0;
           }

           while(odd == k){
               if(nums[start]%2!=0){
                   odd--;
               }
               count +=1;
               start++;
           }
        ans += count;
        end++;

       }
       return ans; 
    }
}
