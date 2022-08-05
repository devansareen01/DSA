public class palindromelinkedList {
    public static Node<Integer> reverseItrate(Node<Integer> head) {
        Node<Integer> cur = head;
        Node<Integer> prev = null;
        while (cur != null) {
            Node<Integer> nextNode = cur.next;
            
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }

        return prev;
    }

    public static Node<Integer> middle(Node<Integer> head) { //
        Node<Integer> hare = head;
        Node<Integer> turtle = head;
        while (hare.next != null && hare.next.next != null) {
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }

    public static boolean ispalindrome(Node<Integer> head) {
        if (head == null || head.next == null) {
            return true;
        }

        Node<Integer> firstHalf = middle(head); // 1st half ka end
        Node<Integer> secondHalf = reverseItrate(firstHalf.next);// reverse 2nd half

        while (secondHalf != null) { // compare firsthalf element and second half element
            if (head.data != secondHalf.data) {
                return false;
            }
            head = head.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<Integer>(null);
        Node<Integer> head = node.takeInput();
        System.out.println(ispalindrome(head));
    }
}
