import java.util.Stack;

public class minimumBracketReversal {
    public static int countRev(String s) {
        // if number of character is odd string cannot be balanced
        if (s.length() % 2 != 0) {
            return -1;
        }
        // the idea is to first remove all the balanced part of expression
        // after remaining balanced part ,we always end up with an expression
        // form }}...}{{....{

        // step1 we have to create a stack and iterate the string
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '}' && !stack.empty()) {// step 2 if we get } and top is { we push into the stack
                if (stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(c); // and if we get } and top is not { we push into the stack
            } else {
                stack.push(c);// else if we find { we push into the stack
            }
        }
        // red len is reduved length
        int redLen = stack.size();
        int n = 0;
        while (!stack.isEmpty() && stack.peek() == '{') {
            stack.pop();
            n++;
        }

        return (redLen / 2 + n % 2);
    }

    public static void main(String[] args) {
        String s1 = "{{{{}}";
        String s2 = "{{}}}";

        System.out.println(countRev(s1));
        System.out.println(countRev(s2));

    }
}
