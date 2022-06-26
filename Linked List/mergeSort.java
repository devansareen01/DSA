public class mergeSort {
    public static Node<Integer> mergeSort(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> mid = findMid(head);
        Node<Integer> head2 = mid.next;

        mid.next = null;

        Node<Integer> left = mergeSort(head);

        Node<Integer> right = mergeSort(head2);

        Node<Integer> sorted = mergeTwoSortedLL(left, right);

        return sorted;

    }

    public static Node<Integer> mergeTwoSortedLL(Node<Integer> a, Node<Integer> b) {
        if (a == null)
            return b;
        if (b == null) {
            return a;
        }
        if (a.data <= b.data) {
            a.next = mergeTwoSortedLL(a.next, b);
            return a;
        } else {
            b.next = mergeTwoSortedLL(a, b.next);
            return b;
        }

    }

    public static Node<Integer> findMid(Node<Integer> head) {

        Node<Integer> hare = head;
        Node<Integer> turtle = head;

        while (hare == null && hare.next == null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<Integer>(null);
        Node<Integer> head = node.takeInput();
        Node<Integer> sorted = mergeSort(head);
        node.print(sorted);
    }
}
