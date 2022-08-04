
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

    public static Node<Integer> takeInput() {
        Node<Integer> head = null, tail = null; // head or tail intially null honge
        Scanner scn = new Scanner(System.in);
        int data = scn.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) { // agar head null to head mai new node ka address chla jayha
                                // same tail mai
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;// node ke next mai nextnode ka reference
                tail = tail.next; // abb tail ko next node ke sath link krne ke lie tail ko update
            }
            data = scn.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Node<Integer> head = takeInput();
        int pos = scn.nextInt();
        head = DeleteInLL(head, pos);
        print(head);
    }
}