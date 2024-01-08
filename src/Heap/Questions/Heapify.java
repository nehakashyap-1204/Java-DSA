package Heap.Questions;

import java.util.ArrayList;
import java.util.List;

public class Heapify {
    public static void heapify(List<Integer> arr) {
        int firstNonLeafNode = ((arr.size() -1) -1) /2;

        for (int i = firstNonLeafNode; i >= 0 ; i--) {
            pushDownInMinHeap(arr, i, arr.size() -1);
        }
    }
    public static void swap(List<Integer> heap, int l, int r) {
        int temp = heap.get(l);
        heap.set(l, heap.get(r));
        heap.set(r, temp);
    }
    public static void pushDownInMinHeap(List<Integer> heap, int i, int n) {
        if (i == n) {
            return;
        }
        int left = (i * 2) + 1;
        int right = (i * 2) + 2;
        int smallest = i;
        if (left <= n && heap.get(left) < heap.get(smallest)) {
            smallest = left;
        }
        if (right <= n && heap.get(right) < heap.get(smallest)) {
            smallest = right;
        }
        if (smallest == i) {
            return;
        }

        swap(heap, smallest, i);
        pushDownInMinHeap(heap, smallest, n);
    }
    public static void main(String[] args) {
        List<Integer> heap = new ArrayList<>();
        heap.add(90);
        heap.add(80);
        heap.add(70);
        heap.add(20);
        heap.add(10);
        heap.add(50);
        heap.add(60);
        System.out.println(heap);
        heapify(heap);
        System.out.println(heap);
    }
}
