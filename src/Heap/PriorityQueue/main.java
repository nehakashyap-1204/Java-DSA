package Heap.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(8);
        pq.add(15);
        pq.add(91);
        pq.add(4);
        pq.add(33);
        pq.add(75);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
