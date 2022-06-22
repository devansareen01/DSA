public class removeDupllicate {

    public static Node<Integer> removeDupplicate(Node<Integer> head) {

        Node<Integer> temp = head;
        if (temp == null) {
            return head;
        }
        // Transverse list till end
        // if next element mathces previous then skip this link and move forward
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else
                temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(null);
        Node<Integer> head = node1.takeInput();
        removeDupplicate(head);
        node1.print(head);
    }
}
