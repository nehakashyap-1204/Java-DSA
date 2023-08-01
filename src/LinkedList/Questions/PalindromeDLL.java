package LinkedList.Questions;

public class PalindromeDLL {
    public static boolean palindrome(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node h1 = head;
        Node t1 = temp;
        while (h1 != t1) {
            if (h1.val != t1.val) {
                return false;
            }
            h1 = h1.next;
            t1 = t1.prev;
        }
        return true;
    }
    public static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = val;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(3);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(4);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        System.out.println(palindrome(a));
    }
}
