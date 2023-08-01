package LinkedList.Questions;

public class ReverseLL {
    public static Node Reverselist(Node head) {
        if (head.next == null) {
            System.out.println();
            return head;
        }
        Node newNode = Reverselist(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node Reverselist2(Node head) {
        Node prev = null;
        Node curr = head;
        Node after = null;
        while (curr != null) {
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
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
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        a = Reverselist2(a);
        display(a);

    }
}
