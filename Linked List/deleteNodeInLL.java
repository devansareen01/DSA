
import java.util.Scanner;

public class deleteInLL {

    public static Node<Integer> DeleteInLL(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            head = head.next;
            return head;
        }
        Node<Integer> temp = head;
        int i = 0;
        while (temp != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null || temp.next == null) {
            return head;
        } else {
            temp.next = temp.next.next;
        }
        return head;
    }
