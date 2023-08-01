package LinkedList;

public class BasicsLL {
    public static void insertAtEnd(Node head, int val) {
        Node temp = head;
        Node t = new Node(val);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = t;

    }
    public static class Node{
        int data; // value
        Node next;  // address of new node

        public Node(int data){
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
    public static void displayRec(Node head) {
        if (head == null)  return;
        displayRec(head.next);
        System.out.print(head.data+" ");
    }
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5 3 9 8 16
        a.next = b;  // 5 -> 3  9  8  16
        b.next = c;  // 5 -> 3 -> 9  8  16
        c.next = d;  // 5 -> 3 -> 9 -> 8  16
        d.next = e;// 5 -> 3 -> 9 -> 8 -> 16

        display(a);
        System.out.println();
        displayRec(a);

        System.out.println();
        insertAtEnd(a, 90);
        display(a);
    }
}
