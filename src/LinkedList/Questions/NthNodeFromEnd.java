package LinkedList.Questions;

public class NthNodeFromEnd {
    public static Node nthNode(Node head, int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int m = size - n +1;
        temp = head;
        for (int i = 1; i <= m-1; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNode2(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(9);
        Node c = new Node(19);
        Node d = new Node(12);
        Node e = new Node(7);
        Node f = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node temp = nthNode2(a, 3);
        System.out.println(temp.data);
    }
}
