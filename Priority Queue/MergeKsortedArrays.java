import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKsortedArrays {
    static class pair implements Comparable<pair> {
        int listIndex;
        int dataIndex;
        int val;

        public pair(int listIndex, int dataIndex, int val) {
            this.listIndex = listIndex;
            this.dataIndex = dataIndex;
            this.val = val;
        }

        public int compareTo(pair o) {
            return this.val - o.val; // it will give min  from priority queue if we write o.val - this.val it will give max from priority queue
        }
    }

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (int i = 0; i < kArrays.size(); i++) {
            pair p = new pair(i, 0, kArrays.get(i).get(0));// adding ith list's ith elemnts and its data
            pq.add(p);
        }

        while (pq.size() > 0) {
            pair p = pq.remove();// removing minimum priority pair and increasing index if lenght is less than 0
            res.add(p.val);
            p.dataIndex++;

            if (p.dataIndex < kArrays.get(p.listIndex).size()) {
                p.val = kArrays.get(p.listIndex).get(p.dataIndex);
                pq.add(p);
            }
        }
        return res;

    }
}