public class cdlNode<t> {
    cdlNode<t> next;
    cdlNode<t> prev;
    t data;

    cdlNode(t data) {
        this.data = data;
        next = null;
        prev = null;
    }

}
