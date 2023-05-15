class pair{
    int ele;
    int freq;
    public pair(int ele , int freq ){
        this. ele= ele;
        this.freq = freq;
    }
}
class Solution {
    public int sumSubarrayMins(int[] arr) {
        long mod  = (long) 1e9+7;
        int n = arr.length;

        int left[] = new int[n];
        int right[] = new int[n];

        ArrayDeque<pair> st1 = new ArrayDeque<>();
        ArrayDeque<pair> st2  = new ArrayDeque<>();

        // filling left array
        for( int i =0; i<n; i++){
            int curr = arr[i];

            int count = 1;
            while(!st1.isEmpty() && st1.peek().ele > curr){
                count += st1.peek().freq;
                st1.pop();
            }
            st1.push(new pair(curr , count));
            left[i] = count;
        }

         // filling right array
        for( int i =n-1; i>=0; i--){
            int curr = arr[i];

            int count = 1;
            while(!st2.isEmpty() && st2.peek().ele >= curr){
                count += st2.peek().freq;
                st2.pop();
            }
            st2.push(new pair(curr , count));
            right[i] = count;
        }
        long ans = 0;
        for(int i =0; i<n; i++){
            long curr = (right[i]*left[i]) % mod;
            curr = (curr * arr[i]) % mod;
            ans  = (ans + curr)%mod;
        }
        return (int)ans% (int) mod;

    }
}
