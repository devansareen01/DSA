class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int ans = 0;
        int totalsum =0;
        int sum[] = new int[n];
        for(int i =0; i<n;i++){
            totalsum += cardPoints[i];
            sum[i] = totalsum;
        }
        if(n==k) return totalsum;
        int i =0;
        int j = n-k-1;
         int subSum = sum[j];
         int points = totalsum - subSum;
        ans = Math.max(ans , points );
        while( j < n-1){
           j++;
           subSum = sum[j] - sum[i];
           i++;
           points = totalsum - subSum;
            ans = Math.max(ans , points );
        }
        return ans ;
    }
}
