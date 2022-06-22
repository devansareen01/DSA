public class removeDupllicate {

    public static void removeDupplicate(Node<Integer> head) {
        Node<Integer> curr = head;
        // Transverse list till the last node
        while (curr != null) {
            Node<Integer> temp = curr;
            // compare current and next node and keep them deleting until it matches
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(null);
        Node<Integer> head = node1.takeInput();
        removeDupplicate(head);
        node1.print(head);
    }
}
