package Heap.PriorityQueue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int k = 2;
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);
        list.add(8);
        list.add(15);



//        List<Integer> list2 = new ArrayList<>(list); // SC O(N)
//        list2.sort(Comparator.reverseOrder()); // TC O(logN)
//        System.out.println(list2.get(k-1)); // O(1)

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < list.size(); i++) {
            if (pq.size() == k) {
                if (pq.peek() < list.get(i)) {
                    pq.remove();
                    pq.add(list.get(i));
                    continue;
                } else {
                    continue;
                }
            }
            pq.add(list.get(i));
        }
        System.out.println(pq.peek());
    }
}
