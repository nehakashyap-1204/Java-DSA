package Heap.PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthOperation {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        System.out.println(KthOperations(list, 3));
    }
    public static int KthOperations(List<Integer> list, int k) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);

        for (int i = 0; i < k; i++) {
            int x = pq.remove();
            int y = pq.remove();
            pq.add(x * y);
        }
        while (pq.size() != 1) {
            pq.remove();
        }
        return pq.peek();
    }
}
