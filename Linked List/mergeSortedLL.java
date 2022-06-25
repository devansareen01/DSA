public class mergrTwoSortedLL {
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

    public static void main(String[] args) {
        Node<Integer> node = new Node<Integer>(null);
        Node<Integer> head1 = node.takeInput();
        Node<Integer> head2 = node.takeInput();
        node.print(mergeTwoSortedLL(head1, head2));

    }
}
