class Solution {
    static int[] replaceWithRank(int arr[], int N) {
    HashMap<Integer,Integer> map = new HashMap<>();
    
        int newArr[]  = Arrays.copyOfRange(arr , 0 , N);
        Arrays.sort(newArr);
    int  k = 1;
    for(int i =0; i<N;i++){
        if(!map.containsKey(newArr[i])){
            map.put(newArr[i] , k);
            k++;
        }
    }
    
    
    
    int ans[] = new int[N];
    for(int i =0;i<N;i++){
        ans[i] = map.get(arr[i]);   
    }
    return ans;
  }
}
