class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if( hand.length % groupSize != 0) return false;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int it : hand ){
            pq.add(it);
        }

        while(!pq.isEmpty()){
            int val = pq.peek();
            for(int i = val ; i < val + groupSize; i++){
                if(!pq.contains(i)) return false;
                else 
                    pq.remove(i);
            }
        }
      return true;
    }
}
