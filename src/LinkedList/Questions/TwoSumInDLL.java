package LinkedList.Questions;

public class TwoSumInDLL {
    public static void twosum(Node head, int target) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node h1 = head;
        Node t1 = temp;
        while (h1.val < t1.val) {
            if (h1.val + t1.val == target) {
                System.out.println(h1.val + t1.val);
                break;
            }
            else if(h1.val + t1.val > target) {
                t1 = t1.prev;
            }
            else if (h1.val + t1.val < target){
                h1 = h1.next;
            }

        }

    }
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next= d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        twosum(a, 103);
    }
}
