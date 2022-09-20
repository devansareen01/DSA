import java.util.ArrayList;
import java.util.PriorityQueue;

public class kthLargestInArray {

    public static int findKthLargest(ArrayList<Integer> nums, int k) {

        int ans[] = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (; i < k; i++) {// adding k element into queue imaging that first k elements are largest
            pq.add(nums.get(i));
        }
        for (; i < nums.size(); i++) {
            int min = pq.peek();// finding min in queue
            if (nums.get(i) > min) {
                pq.remove();// comapring if element is greter than remove min from queue and add new greater
                            // element
                pq.add(nums.get(i));
            }
        }
        
        return pq.peek();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(8);
        arr.add(89);
        arr.add(67);
        arr.add(5);
        arr.add(7);
        arr.add(0);
        int k = 2;
    
        System.out.println(findKthLargest(arr, k));
    }
}
