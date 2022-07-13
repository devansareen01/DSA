package Stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static boolean IsBalance(Stack<Character> st, String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
                st.push(str.charAt(i));
            }

            else if (str.charAt(i) == ')') {
                boolean smallAns = conditionChecker(st, '(');
                if (smallAns == false) {
                    return false;
                }
            }

            else if (str.charAt(i) == ']') {
                boolean smallAns = conditionChecker(st, '[');
                if (smallAns == false) {
                    return false;
                }
            }

            else if (str.charAt(i) == '}') {
                boolean smallAns = conditionChecker(st, '{');
                if (smallAns == false) {
                    return false;
                }
            }

        }
        if (st.size() == 0) {
            return true;
        }

        else {
            return false;
        }

    }

    public static boolean conditionChecker(Stack<Character> st, char ch) {
        if (st.size() == 0) {
            return false;
        } else if (ch != st.peek()) {
            return false;
        }

        else {
            st.pop();
            return true;
        }

    }

    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();
        String str = " {[(a+b)]}";
        String str1 = "{ a + [ b - c } ]";
        System.out.println(IsBalance(st, str));
        System.out.println(IsBalance(st, str1));

    }
}
