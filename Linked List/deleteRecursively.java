public class deleteRecursively {
    public static Node<Integer> deleteR(Node<Integer> head, int pos) {
        if (pos == 0) {
            head = head.next;
            return head;
        }
        if (head == null) {
            return head;
        }
        head.next = deleteR(head.next, pos - 1);
        return head;
    }
