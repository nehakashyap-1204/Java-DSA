package Stacks.Questions;

import java.util.Stack;

public class DisplayStack {
    public static void displayReverseRec(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void displayRec(Stack<Integer> st) {
        if (st.size() == 0) return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static Stack<Integer> pushAtBottom(Stack<Integer> st, int x) {
        if (st.size() == 3)
            st.push(x);
        else {
            int top = st.pop();
            pushAtBottom(st, x);
            System.out.print(top + " ");
            st.push(top);
        }
        return st;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Using Another Stack
//        Stack<Integer> rt = new Stack<Integer>();
//        while (st.size() > 0) {
//            rt.push(st.pop());
//        }
//        while (rt.size() > 0) {
//            int x = rt.pop();
//            System.out.print(x+" ");
//            st.push(x);
//        }

        // Using Array
//        int n = st.size();
//        int[] arr = new int[n];
//        for (int i = n-1; i >= 0 ; i--) {
//            int x = st.pop();
//          arr[i] = x;
//            arr[i] = st.pop();
//        }
//        for (int i = 0; i < n; i++) {
//            int x = arr[i];
//            st.push(x);
//            System.out.print(arr[i]+" ");
//           st.push(arr[i]);
//        }

        // Using Recursion
//        displayRec(st);

        pushAtBottom(st, 7);
        System.out.println(st);

    }
}
