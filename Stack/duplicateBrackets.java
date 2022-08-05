// package Stack;

import java.util.Stack;

public class reduntatBrackets {

    public static boolean findRedundantBrackets(String s) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == ')') {
                if (s1.peek() == '(') {
                    return true;
                } else {
                    while (s1.peek() != '(') {
                        s1.pop();
                    }
                    s1.pop();
                }

            } else {
                s1.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "((a+b) + ((c+d))"; // true there is redundancy
        System.out.println(findRedundantBrackets(s));
        String s1 = "(a+b)"; // false no redundancy
        System.out.println(findRedundantBrackets(s1));
        String s2 = "((a+b)+(c+d))"; // false no redundancy
        System.out.println(findRedundantBrackets(s2));
    }

}
