
public class reverseRecursivelyDoubleNode {
    public static doubleNode reverseRecursively(Node<Integer> head) {
        if (head == null || head.next == null) {
            doubleNode ans = new doubleNode();
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        doubleNode smallAns = reverseRecursively(head.next);
        smallAns.tail.next = head;
        head.next = null;
        doubleNode ans = new doubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<Integer>(null);
        Node<Integer> head = node.takeInput();
        doubleNode ans = reverseRecursively(head);
        node.print(ans.head);
    }
}
