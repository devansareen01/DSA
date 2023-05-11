class Solution {
    public int countSubarray(int nums[] , int k){
        if(k < 0) return 0;
         HashMap<Integer,Integer> map = new HashMap<>();
        
        int i =0 , j =0;
        int ans = 0;
        while(i < nums.length){
            
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
            
          
             
            while(map.size() > k){
                if(map.get(nums[j])== 1)
                    map.remove(nums[j]);
                else
                    map.put(nums[j] , map.get(nums[j])-1); 
                j++;
            }
            
            ans+= i-j+1;
            i++;
           
        }
        
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
         return countSubarray(nums , k) - countSubarray(nums , k-1);
    }
}
