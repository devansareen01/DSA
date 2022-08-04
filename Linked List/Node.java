public class Node<t> {
    t data; // data is our node's data at head position
    Node<t> next; // next is referencing to next postion in node

    Node(t data) {
        this.data = data;
        next = null;
    }

}
