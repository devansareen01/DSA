import java.util.Scanner;

public class print_ithNode {
    public static void print_ith(Node<Integer> head, int idx) {
      
        int i = 0;
        while (i < idx - 1) {
            head = head.next;
            i++;
        }

        System.out.println(head.next.data);
    }
