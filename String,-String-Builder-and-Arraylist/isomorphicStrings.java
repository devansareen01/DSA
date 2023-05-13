class Solution {
    public boolean isIsomorphic(String str1, String str2) {
       HashMap<Character , Character> map = new HashMap();
        
        boolean vis[] = new boolean[128];
        if(str1.length() != str2.length()) return false;
        for(int i =0; i<str1.length(); i++){
            char ch  = str1.charAt(i);
            
            if(map.containsKey(ch)){
                
                if(map.get(ch) != str2.charAt(i)) return false;
            }else{
                if(vis[str2.charAt(i)]) return false;
                vis[str2.charAt(i)] = true;
                map.put(ch , str2.charAt(i));
            }
            
        }
        return true;
        
    }
}
