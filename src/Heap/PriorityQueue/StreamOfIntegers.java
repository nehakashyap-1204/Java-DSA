package Heap.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StreamOfIntegers {
    public static void main(String[] args) {
        PriorityQueue<Integer> leftPq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> rightPq = new PriorityQueue<>();
        add(leftPq, rightPq, 15);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 10);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 5);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 20);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 25);
        System.out.println(findMedian(leftPq, rightPq));
        add(leftPq, rightPq, 17);
        System.out.println(findMedian(leftPq, rightPq));

    }
    public static void add(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq, int element){
        if (leftPq.isEmpty()) {
            leftPq.add(element);
            return;
        }
        // agar left me jana h
        if (element < leftPq.peek()) {
            if (leftPq.size() == rightPq.size()) {
                leftPq.add(element);
            } else {
                rightPq.add(leftPq.remove());
                leftPq.add(element);
            }
        }
        // agar right me jana h
        else {
            if (leftPq.size() == rightPq.size()) {
                leftPq.add(rightPq.remove());
                rightPq.add(element);
            } else {
                rightPq.add(element);
            }
        }
    }
    public static double findMedian(PriorityQueue<Integer> leftPq, PriorityQueue<Integer> rightPq) {
        if (leftPq.isEmpty()) {
             return -1;
        }
        else if (leftPq.size() - rightPq.size() == 1) {
            return leftPq.peek();
        } else {
            return (double) ((leftPq.peek() + rightPq.peek())) /2;
        }
    }
}
