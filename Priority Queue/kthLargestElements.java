import java.util.PriorityQueue;

public class kthLargestElements {
    public static int[] kthLargest(int arr[], int k) {
        int ans[] = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (; i < k; i++) {//adding k element into queue imaging that first k elements are largest
            pq.add(arr[i]);
        }
        for (; i < arr.length; i++) {
            int min = pq.peek();// finding min in queue
            if (arr[i] > min) {
                pq.remove();// comapring if element is greter than remove min from queue and add new greater element
                pq.add(arr[i]);
            }
        }
        int j = 0;
        while (!pq.isEmpty()) {
            ans[j] = pq.remove();//filling ans array
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3 };
        int k = 4;
        int ans[] = kthLargest(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
