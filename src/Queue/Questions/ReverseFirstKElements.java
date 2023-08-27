package Queue.Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    public static void main(String[] args) {
        int k = 3;
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }
        while (st.size() > 0){
            q.add(st.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
        System.out.println(q);
    }
}
