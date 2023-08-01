package Stacks.Questions;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<Integer>();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       System.out.println(st);

       // reverse order
       Stack<Integer> gt = new Stack<Integer>();
       while (st.size() > 0) {
          gt.push(st.pop());
        }
       System.out.println(gt);

       Stack<Integer> rt = new Stack<Integer>();
       while (gt.size() > 0) {
          rt.push(gt.pop());
        }
       System.out.println(rt);
    }
}
