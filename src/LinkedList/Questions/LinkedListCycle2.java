package LinkedList.Questions;

public class LinkedListCycle2 {
    public static Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // there is a cycle
                Node temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
        return null;
    }
    public static class Node {
        int data ;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(19);
        Node b = new Node(18);
        Node c = new Node(29);
        Node d = new Node(27);
        Node e = new Node(99);
        Node f = new Node(109);
        Node g = new Node(91);
        Node h = new Node(98);
        Node i = new Node(71);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = c;

        Node ans = detectCycle(a);
        System.out.println(ans.data);
    }
}
