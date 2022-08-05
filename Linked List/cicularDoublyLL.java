
import java.util.Scanner;

public class circularDoublyLL {
  // taking input of circular doubly LL
    public static cdlNode<Integer> takeInput() {
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();

        cdlNode<Integer> head = null;
        cdlNode<Integer> tail = null;

        while (data != -1) {
            cdlNode<Integer> newNode = new cdlNode<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = tail.next;
            }

            data = scn.nextInt();
            if (data == -1) {
                head.prev = tail;
                tail.next = head;
            }
        }

        return head;

    }
  // print  of circular doubly LL
    public static void print(cdlNode<Integer> head) {
        cdlNode<Integer> temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print(temp.data + "->");
        System.out.println();
    }
  //insert in   circular doubly LL
    public static cdlNode<Integer> insert(cdlNode<Integer> head, int pos, int elem) {
        if (pos == 0) {
            cdlNode newNode = new cdlNode(elem);
            cdlNode prevNode = head.prev;
            newNode.next = head;
            newNode.prev = prevNode;
            prevNode.next = newNode;

            return newNode;
        }
        if (head == null) {
            return head;
        }
        head.next = insert(head.next, pos - 1, elem);
        return head;
    }
// delete in   circular doubly LL
    public static cdlNode<Integer> deleteR(cdlNode<Integer> head, int pos) {
        if (pos == 0) {
            cdlNode<Integer> prevNode = head.prev;
            head = head.next;
            head.prev = null;
            head.prev = prevNode;
            prevNode.next = head;
            return head;
        }

        if (head == null) {
            return head;
        }
        head.next = deleteR(head.next, pos - 1);
        return head;
    }

    public static void main(String[] args) {
        cdlNode<Integer> head = takeInput();
        // print(head);
        // System.out.println(head.prev.data + " " + "(head ke prev mai tail ka data)");
        // System.out.println(head.prev.next.data + " " + " (tail ke next mai head ka
        // data)");
        // cdlNode<Integer> head1 = insert(head, 3, 10);
        // print(head1);
        cdlNode<Integer> head2 = deleteR(head, 3);
        print(head2);

    }
}
