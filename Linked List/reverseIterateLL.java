public class reverseItrate {

    public static Node<Integer> reverseItrate(Node<Integer> head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node<Integer> cur = head;
        Node<Integer> prev = null;
        while (cur != null) {
            Node<Integer> nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }

        head = prev;
        return head;
    }
