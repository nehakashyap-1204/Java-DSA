package Heap.PriorityQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

public class ComparatorClass {
    public static class Student {
        String name;
        int marks;
        int rollNo;
        String dob;
    }

    public static class StudentComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            if (s1.marks > s2.marks) {
                return -1;
            } else if (s2.marks > s1.marks) {
                return 1;
            } else {
                if (s1.rollNo > s2.rollNo) {
                    return -1;
                } else if (s2.rollNo > s1.rollNo) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }
    public static void main(String[] args) {

//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(50);
//        pq.add(5);
//        pq.add(45);
//        pq.add(21);
//        pq.add(7);
//        pq.add(13);
//        pq.add(3);
//        System.out.println(pq);
//        System.out.println(pq.remove());
//        System.out.println(pq);

        PriorityQueue<Student> studentPriorityQueue = new PriorityQueue<>(new StudentComparator());
        Student harsh = new Student();
        harsh.name = "harsh";
        harsh.rollNo = 14;
        harsh.marks = 99;
        harsh.dob = "12-10-2001";
        studentPriorityQueue.add(harsh);

        Student raghav = new Student();
        raghav.name = "raghav";
        raghav.rollNo = 24;
        raghav.marks = 99;
        raghav.dob = "05-12-2000";
        studentPriorityQueue.add(raghav);

        System.out.println(studentPriorityQueue.peek().name);
        System.out.println(studentPriorityQueue.peek().rollNo);
        System.out.println(studentPriorityQueue.peek().marks);

    }



}
