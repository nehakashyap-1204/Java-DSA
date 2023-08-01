package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DisplayQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Queue<Integer> helper = new ArrayDeque<Integer>();
        while (q.size() > 0){
            System.out.print(q.peek()+" ");
            int x = q.remove();
            helper.add(x);
        }
        while (helper.size() > 0) {
            q.add(helper.remove());
        }
    }
}
