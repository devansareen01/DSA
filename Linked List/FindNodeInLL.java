import java.util.Scanner;

public class FindNodeInLL {
    public static int Find_in_LL(Node<Integer> head, int val) {
        return helper(head, val, 0);
    }

    public static int helper(Node<Integer> head, int val, int idx) {

        if (head == null) {
            return -1;
        }
        if (head.data == val) {
            return idx;
        }

        return helper(head.next, val, idx + 1);
    }

    public static Node<Integer> takeInput() {
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

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        System.out.println(Find_in_LL(head, val));
    }
}
