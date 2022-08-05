import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void ReverseStack(Stack<Integer> stack) {
        if (stack.istackEmpty()) {
            return;
        }
        int temp = stack.peek();
        stack.pop();
        Reverstackestacktack(stack);
        PustackhAtLast(stack, temp);
    }

    public static void PushAtLast(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int temp = s.peek();
        s.pop();
        PushAtLast(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }
        ReverseStack(stack);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

    }
}
