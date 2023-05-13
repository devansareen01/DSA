/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Pair {
    Integer ch;
    Integer freq;

    public Pair(Integer ch, Integer freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

class GFG {
    public static ArrayList<Integer> frequencySort(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                if(p2.freq == p1.freq) return p1.ch-p2.ch;
                return p2.freq - p1.freq; // compare frequencies in descending order
            }
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            for (int i = 0; i < p.freq; i++) {
                ans.add(p.ch);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();
            ArrayList<Integer> ans = frequencySort(arr);
            int res[] = new int[ans.size()];
            for(int i =0; i<ans.size();i++){
                res[i] = ans.get(i);
                System.out.print(res[i]+" ");
                   
            }
            System.out.println();
            
        }
    }
}
