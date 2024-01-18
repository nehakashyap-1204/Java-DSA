package Heap.PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SumOfK1thAndK2thElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(SumOfElemets(list));
    }

    public static int SumOfElemets(List<Integer> list) {
        list.add(20);
        list.add(8);
        list.add(22);
        list.add(4);
        list.add(12);
        list.add(10);
        list.add(14);
        Collections.sort(list);
        PriorityQueue<Integer> pq = new PriorityQueue<>(list);
        int k1 = 2;
        int k2 = 6;
        int sum = 0;
        for (int i = k1; i < k2 -1; i++) {
            sum += list.get(i);
        }
        return sum;
    }
}