package LinkedList.Questions;

public class MergeTwoSortedLists {
    public static Node mergeTwoLists(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;
        Node head = new Node(100);
        Node temp = head;
        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp1 = temp1.next;
                temp = temp.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
                temp = temp.next;
            }
        }
        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }
        return head.next;
    }
    public static Node mergeTwoLists2(Node list1, Node list2) {
        Node t1 = list1;
        Node t2 = list2;
        Node h  = new Node(4);
        Node t = h;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                t.next = t1;
                t = t1;
                t1 = t1.next;
            } else {
                t.next = t2;
                t = t2;
                t2 = t2.next;
            }
        }
        if (t1 == null) {
            t.next = t2;
        } else {
            t.next = t1;
        }
        return h.next;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(3);
        Node f = new Node(4);
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;

      mergeTwoLists(a, d);


    }
}
