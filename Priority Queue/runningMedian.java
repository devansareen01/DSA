import java.util.*;
import java.util.PriorityQueue;

public class runningMedian {
    static PriorityQueue<Integer> MinQue = new PriorityQueue<>();// max priority queue
    static PriorityQueue<Integer> MaxQue = new PriorityQueue<>(Collections.reverseOrder());// min priority queue

    public static void findMedian(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (MaxQue.isEmpty() || arr[i] <= MaxQue.peek()) {
                MaxQue.add(arr[i]);
            } else {
                MinQue.add(arr[i]);
            }
            if (MaxQue.size() > MinQue.size() + 1) {// difference in sizes of queue should not be greater than 1 
                MinQue.add(MaxQue.poll());// if diff become greater than we will balance
            } else if (MinQue.size() > MaxQue.size()) {
                MaxQue.add(MinQue.poll());
            }
            medianCalculator();
        }
    }

    private static void medianCalculator() {
        int res = 0;
        if (MinQue.size() == MaxQue.size()) {
            res = (MinQue.peek() + MaxQue.peek()) / 2;
        } else {
            res = MaxQue.peek();
        }
        System.out.print(res + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 1, 3, 7, 5 };
        findMedian(arr);
    }

}