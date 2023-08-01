package Stacks.Questions;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        reverse(st);
        System.out.println(st);

        // Iterative Solution:
        /*
        System.out.println("st : "+ st);

        Stack<Integer> rt = new Stack<Integer>();
        while (st.size() > 0) {
            rt.push(st.pop());
        }
        System.out.println("rt : " +rt);

        Stack<Integer> qt = new Stack<Integer>();
        while (rt.size() > 0) {
            qt.push(rt.pop());
        }
        System.out.println("qt : "+qt);

        while (qt.size() > 0) {
            st.push(qt.pop());
        }
        System.out.println("st : "+st);
         */
    }
    public static void reverse(Stack<Integer> st) {
        if (st.size() == 1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(st, top);
    }
    public static void pushAtBottom(Stack<Integer> st, int x) {
        if (st.size() == 0) {
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
}
