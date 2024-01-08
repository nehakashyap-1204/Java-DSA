package Heap.Questions;

import java.util.ArrayList;
import java.util.List;

public class DeletionInMinHeap {
    public static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void pushDownInMinHeap(List<Integer> heap, int index) {
        int n = heap.size() -1;

        if (index == n) {
             return;
        }
        int left = (2 * index) + 1;
        int right = (2 * index) + 2;
        int smallest = index;

        if (left <= n && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }

        if (right <= n && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }

        if (smallest == index) {
            return;
        }

        swap(heap, index, smallest);
        pushDownInMinHeap(heap, smallest);
    }
    public static void deleteFromMinHeap(List<Integer> heap) {
        swap(heap, 0, heap.size() -1);
        heap.remove(heap.size() -1);

        pushDownInMinHeap(heap, 0);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(5);
        heap.add(20);
        heap.add(10);
        heap.add(40);
        heap.add(50);
        heap.add(30);
        heap.add(60);
        System.out.println(heap);
        deleteFromMinHeap(heap);
        System.out.println(heap);
    }
}
