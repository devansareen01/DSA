public class priorityQueueUse {
    public static void main(String[] args) throws priorityQueueException {
        
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        priorityQueue pq = new priorityQueue();
        for (int i : arr) {
            pq.insert(i);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove()+" ");
        }
        System.out.println();
        

    }
}
