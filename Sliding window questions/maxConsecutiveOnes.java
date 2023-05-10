class Solution {
    public int longestOnes(int[] nums, int k) {
        int j =0;
        int zeroc = 0;
        int ans =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroc ++;
            }
            while(zeroc > k){
                if(nums[j] ==0){
                    zeroc--;
                }
                j++;
            }
            ans = Math.max(ans ,i-j+1 );
        }
        return ans;
    }
}
