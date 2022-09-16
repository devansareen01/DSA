import java.util.ArrayList;

public class priorityQueue {
    ArrayList<Integer> heap;

    public priorityQueue() {
        heap = new ArrayList<>();
    }

    int size() {
        return heap.size();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int getMin() throws priorityQueueException {
        if (heap.isEmpty()) {
            throw new priorityQueueException();
        }
        return heap.get(0);
    }

    void insert(int element) {

        heap.add(element);// adding at last in our array
        // now checking priority using upward heapify
        int childIndex = heap.size() - 1;// last element of array
        int parentIndex = (childIndex - 1) / 2;// parent index of our childIndex
        while (childIndex > 0) {

            if (heap.get(childIndex) < heap.get(parentIndex)) {// swapping
                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(childIndex));
                heap.set(childIndex, temp);
                childIndex = parentIndex;// when we become at top our parent index will become 0 (out of loop )
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }

    }

    int remove() throws priorityQueueException {
        if (heap.isEmpty()) {
            throw new priorityQueueException();
        }
        int temp = heap.get(0);// first element will our minimum element in our heap
        heap.set(0, heap.get(heap.size() - 1));// copying last element at 0th index
        heap.remove(heap.size() - 1);// removing last element
        // now completing heap order property:- downward heapify
        int index = 0;
        int minIndex = index;
        int leftChild = 1;
        int rightChild = 2;
        while (leftChild < heap.size()) {
            if (heap.get(index) > heap.get(leftChild)) {
                minIndex = leftChild;
            }
            if (rightChild > heap.size() && heap.get(index) > heap.get(rightChild)) {
                minIndex = rightChild;
            }
            if (index == minIndex) {
                break;
            } else {
                // swapping
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                index = minIndex;
                leftChild = 2 * index + 1;
                rightChild = 2 * index + 2;
            }

        }
        return temp;
    }
}
