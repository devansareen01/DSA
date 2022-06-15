public class node<t> {
    t data; // data is our node's data at head position
    node<t> next; // next is referencing to next postion in node

    node(t data) {
        this.data = data;
        next = null;
    }
}
