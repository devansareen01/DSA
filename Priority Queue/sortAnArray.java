import java.util.PriorityQueue;

public class sortAnArray
{ 
   public static int[] sortArr(int[] arr, int n) 
    { 
        int ans[] = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0;i<n ;i++){
            pq.add(arr[i]);
        }
        for(int i =0;i<n;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
} 
