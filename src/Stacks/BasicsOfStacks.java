package Stacks;

import java.util.Stack;

public class BasicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(19);
        System.out.println(st.peek());
        System.out.println(st);
//        st.pop();
//        System.out.println(st);
//        st.pop();
//        System.out.println(st);
        System.out.println("size is:"+ st.size());
        while (st.size()>2) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
