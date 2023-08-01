package Stacks.Questions;

import java.util.Stack;

public class PushAtBottomRec {
   public static void pushAtbottom(Stack<Integer> st) {
       if (st.size() == 0) {
           st.push(6);
           return;
       }
       int top = st.pop();
       pushAtbottom(st);
       System.out.print(top+" ");
       st.push(top);
   }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        pushAtbottom(st);
    }
}
