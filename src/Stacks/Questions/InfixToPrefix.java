package Stacks.Questions;

import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        String infix = "(3+5*8)/4-2";
        Stack<String> val = new Stack<String>();
        Stack<Character> op = new Stack<Character>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57){ // 0 to 9
                String s = "" + ch;
                val.push(s);
            }
            else if (op.size() == 0 || ch == '(' || op.peek() == '(')
                op.push(ch);
            else if (ch == ')'){
                while (op.peek() != '(') {
                    // work
                    String  v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                   String t = o + v1 + v2;
                   val.push(t);
                }
                op.pop(); // remove ')'
            }
            else {
                if (ch == '+' || ch == '-') {
                    // work
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    val.push(t);
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        // work
                        String v2 = val.pop();
                        String v1 = val.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        val.push(t);
                        op.push(ch);
                    } else op.push(ch);
                }
            }
        }
        while (val.size() > 1) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            val.push(t);
        }
        String  prefix = val.pop();
        System.out.println(prefix);
    }
}
