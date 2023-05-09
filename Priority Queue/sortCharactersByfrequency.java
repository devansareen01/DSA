class Pair {
    Character ch;
    Integer freq;

    public Pair(Character ch, Integer freq) {
        this.ch = ch;
        this.freq = freq;
    }
}
class Solution {
     public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                return p2.freq - p1.freq; // compare frequencies in descending order
            }
        });
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(new Pair(entry.getKey(), entry.getValue()));
        }
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            for (int i = 0; i < p.freq; i++) {
                ans += p.ch;
            }
        }
        return ans;
    }
}
