package CollectionFramework;

import java.util.*;

public class QueueInterfaceExamples {
    static void DequeExamples() {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.peek());
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);
    }
    static void PriorityQueueExamples() {
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // min priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); // max priority queue
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek()); // 5 - the smallest element has the highest priority queue
        pq.poll();
        System.out.println(pq.peek()); // topmost priority element will be processed first
        System.out.println(pq);
    }
    static void QueueExamples() {
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
    }
    public static void main(String[] args) {
//        QueueExamples();
//        PriorityQueueExamples();
        DequeExamples();
    }
}
