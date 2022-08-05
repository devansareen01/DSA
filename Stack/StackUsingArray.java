
package Stack;

public class StackUsingArray {
    private int data[];
    private int top;

    // constructor which give is five sized array
    public StackUsingArray() {
        data = new int[5];
        top = -1;
    }

    // size func
    public int size() {
        return top + 1;
    }

    private void restructure() {
        int temp[] = data; // storing a new reference of our current data array in temp
        data = new int[data.length * 2]; // doubling the length of the array and pointing it instead of old array
        for (int i = 0; i < temp.length; i++) // copying the elements of old array into new array
        {
            data[i] = temp[i];

        }
    }

    // is empty func
    public boolean isEmpty() {
        return (top == -1);
    }

    // push func
    public void push(int elem) {
        if (size() == data.length) {
            // throw new StackFullException("Stack is full");
            restructure();
        }
        top++;
        data[top] = elem;
    }
    // pop func

    public int pop() throws StackEmptyException {
        if (isEmpty()) {
            StackEmptyException e = new StackEmptyException();
            throw e;

        }
        top--;
        return data[top + 1];
    }

    // finding top most element of stack
    public int top() throws StackEmptyException {
        if (isEmpty()) {
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public static void main(String[] args) throws StackEmptyException {
        StackUsingArray stack = new StackUsingArray();
        for (int i = 0; i <= 50; i++) {
            stack.push(i);
        }
        System.out.println(stack.size());
        while (!stack.isEmpty()) {
            System.out.println(stack.top());
            stack.pop();
        }

        System.out.println(stack.isEmpty());
    }
}
