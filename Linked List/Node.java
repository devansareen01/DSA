import java.util.Scanner;

public class Node<t> {

    t data; // data is our node's data at head position
    Node<t> next;// next is referencing to next postion in node

    Node(t data) {
        this.data = data;
        next = null;
    }

    // priting LL
    void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    int size(Node<Integer> head) {
        if (head == null) {
            return 0;
        }
        return (1 + size(head.next));
    }

    // taking input
    Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null;
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {

                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = scn.nextInt();
        }
        return head;
    }

    // insterting at
    Node<Integer> insert(Node<Integer> head, int val, int pos) {

        Node<Integer> newNode = new Node<Integer>(val);
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }
        int i = 0;
        Node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // deleting at
    Node<Integer> DeleteInLL(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        }
        Node<Integer> temp = head;
        int i = 0;
        while (temp != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            return head;
        } else {
            temp.next = temp.next.next;
        }
        return head;
    }

}
