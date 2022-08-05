package Stack;

public class StackUsingLL<t> {
    private Node<t> head;
    private int size;

    // tells us the size of stack
    public int size() {
        return size;
    }

    // stack is empty or not
    public boolean isEmpty() {
        return (size == 0);

    }

    // in case of push we will insert elements at begining of linked list
    public void push(t elem) {

        Node<t> newNode = new Node<t>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public t pop() throws StackEmptyException {
        if (size() == 0) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        Node<t> temp;
        temp = head;
        head = head.next;
        size--;

        return temp.data;
    }

    public t top() throws StackEmptyException {
        if (size() == 0) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return head.data;
    }

    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> stack = new StackUsingLL<Integer>();

        stack.push(10);
        stack.push(20);
        stack.push(50);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.top());

    }
}
