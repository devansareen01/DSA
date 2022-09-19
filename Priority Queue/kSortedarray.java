import java.util.PriorityQueue;

import javax.swing.text.html.MinimalHTMLWriter;

public class kSortedarray {
    public static void kSortedarray(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (; i < k; i++) {
            pq.add(arr[i]);
        }
        for (; i < arr.length; i++) {
            arr[i - k] = pq.remove();
            pq.add(arr[i]);
        }

        for (int j = arr.length - k; j < arr.length; j++) {
            arr[j] = pq.remove();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 9, 6, 8 };
        int k = 3;
        kSortedarray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}