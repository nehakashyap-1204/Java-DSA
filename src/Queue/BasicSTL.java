package Queue;

import java.util.LinkedList;
import java.util.Queue;


public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.size());
        q.add(5);
        System.out.println(q);
        q.remove();
        q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.element());

    }
}
