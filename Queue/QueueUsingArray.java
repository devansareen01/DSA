
public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int front() throws queueEmptyException {
        if (size == 0) {
            throw new queueEmptyException();
        }
        return data[front];
    }

    private void restructure() {
        int temp[] = data; // storing a new reference of our current data array in temp
        data = new int[data.length * 2]; // doubling the length of the array and pointing it instead of old array
        for (int i = 0; i < temp.length; i++) // copying the elements of old array into new array
        {
            data[i] = temp[i];

        }
    }

    public void enqueue(int element) {
        if (size() == data.length) {
            restructure();
        }
        if (size() == 0) {
            front = 0;
        }
        rear = (rear + 1) % data.length;// if rear will be on end position then we reset rear
        size++;
        data[rear] = element;
    }

    public int dequeue() throws queueEmptyException {
        if (size() == 0) {
            throw new queueEmptyException();
        }
        int temp = data[front];
        front = (front + 1) % data.length; // if front will be on end position then we reset front
        size--;
        return temp;
    }

    public static void main(String[] args) throws queueEmptyException {
        QueueUsingArray queue = new QueueUsingArray();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println(queue.size());
        System.out.println(queue.front());
    }
}
