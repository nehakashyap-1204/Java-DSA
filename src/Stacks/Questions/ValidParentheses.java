package Stacks.Questions;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack();
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            }
            else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            }
            else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            }
            else
                return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "(()()(";
        System.out.println(isValid(str));
    }
}
