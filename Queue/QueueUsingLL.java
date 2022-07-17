public class QueueUsingLL<t> {
    private Node<t> front;
    private Node<t> rear;
    int size;

    public QueueUsingLL() {
        front = null;
        rear = null;
        size = 0;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public t front() throws queueEmptyException {
        if (size == 0) {
            throw new queueEmptyException();
        }
        return front.data;
    }

    public void enqueue(t elem) {
        Node<t> newNode = new Node<t>(elem);
        if (size == 0) {
            front = newNode;
            rear = newNode;
            size++;
        } else {
            rear.next = newNode;
            rear = rear.next;
            size++;
        }
    }

    /**
     * @return
     */
    t dequeue() throws queueEmptyException {
        if (size == 0) {
            throw new queueEmptyException();
        }
        if (size == 1) {
            Node<t> temp;
            temp = front;
            rear = null;
            size--;
            return temp.data;

        }
        Node<t> temp;
        temp = front;
        front = front.next;
        size--;

        return temp.data;

    }

    public static void main(String[] args) throws queueEmptyException {
        QueueUsingLL<Integer> queue = new QueueUsingLL<Integer>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
        queue.dequeue();
        System.out.println(queue.size());

        System.out.println(queue.front());
        System.out.println(queue.rear.data);

    }

}
