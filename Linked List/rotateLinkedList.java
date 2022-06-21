public class rotateLL {
    public static Node<Integer> rotateLL(Node<Integer> head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int l = 1;
        Node<Integer> temp = head;
        while (temp.next != null) {
            l++;
            temp = temp.next;
        }
        temp.next = head;
        k = k % l;
        k = l - k;

        while (k > 0) {
            k--;
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;

    }
