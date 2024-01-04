package Heap.Questions;

import java.util.ArrayList;
import java.util.List;

public class InsertionInMinHeap {
    public static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void pushupInMinHeap(List<Integer> heap, int i) {
        int parentIdx = (i -1)/2;

        //compare with parent
        //until root reached / correct position found
        if (i == 0 || heap.get(parentIdx) < heap.get(i)) {
            return;
        }
        //swap
        swap(heap, i, parentIdx);
        pushupInMinHeap(heap, parentIdx);
    }
    public static void insertInMinHeap(List<Integer> heap, int element) {
        // add in last
        heap.add(element);

        int index = heap.size() -1;
        pushupInMinHeap(heap, index);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insertInMinHeap(heap, 5);
        System.out.println(heap);
    }
}
