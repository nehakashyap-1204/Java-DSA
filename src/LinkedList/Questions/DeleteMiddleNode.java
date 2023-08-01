package LinkedList.Questions;

public class DeleteMiddleNode {
    public static  Node deleteMiddle(Node head) {
        if (head.next == null)
            return null;
        Node slow = head;
        Node fast = head;
        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
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
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(7);
//        Node e = new Node(1);
//        Node f = new Node(2);
//        Node g = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
//        d.next = e;
//        e.next = f;
//        f.next = g;
        display(a);
        deleteMiddle(a);
        display(a);

    }
}
