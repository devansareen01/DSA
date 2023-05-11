class Solution {
    public int longestkSubstr(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        int i =0 , j =0;
        int ans =-1;
        while(i < s.length()){
            char ch = s.charAt(i);
            
            map.put(ch , map.getOrDefault(ch , 0)+1);
            
            if(map.size() == k)
                ans = Math.max(ans , i-j+1);
            while(map.size() > k){
                
                if(map.get(s.charAt(j))== 1)
                    map.remove(s.charAt(j));
                else
                    map.put(s.charAt(j) , map.get(s.charAt(j))-1);
                j++;
                
                
            }
            i++;
        }
        
        return ans;
    }
}
