package Heap.PriorityQueue;

import java.util.*;

public class SumOfAllElementsBetweenK1thAndK2th {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(SomeOfAllElements2(list));
    }
    public static int SomeOfAllElements(List<Integer> list){
        int k1 = 3;
        int k2 = 6;
        list.add(20);
        list.add(8);
        list.add(22);
        list.add(4);
        list.add(12);
        list.add(10);
        list.add(14);

        Collections.sort(list); // O(NlogN)



        int sum = 0;
        for (int i = k1; i < k2 -1; i++) {  // O(k2-k1)
            sum += list.get(i);
        }
        return sum;
    }
    public static int SomeOfAllElements2(List<Integer> list) {
        int sum = 0;
        int k1 = 2;
        int k2 = 6;
        list.add(18);
        list.add(10);
        list.add(19);
        list.add(3);
        list.add(8);
        list.add(12);
        list.add(15);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            pq.add(list.get(i));

            if (pq.size() > k2) {
                pq.remove();
            }
        }
        pq.remove();
        while (pq.size() != k1) {
            sum += pq.remove();
        }
        return sum;
    }
}
