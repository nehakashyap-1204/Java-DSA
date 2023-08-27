package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q);
        Stack<Integer> st = new Stack<Integer>();
        int n = q.size();
        for (int i = 1; i <= n/2; i++) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        for (int i = 1; i <= n/2; i++) {
            st.push(q.remove());
        }
        for (int i = 1; i <= n/2; i++) {
            q.add(st.pop());
            q.add(q.remove());
        }
        System.out.println(q);
        while (q.size() > 0) {
            st.push(q.remove());
        }
        while (st.size() > 0) {
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
