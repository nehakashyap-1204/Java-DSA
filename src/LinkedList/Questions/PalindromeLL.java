package LinkedList.Questions;

public class PalindromeLL {
    public static boolean palindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next = temp;
        Node p1 = head;
        Node p2 = temp;
        while (p2 != null) {
            if (p1.data != p2.data) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
    public static Node reverse(Node head) {
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
    public static class Node {
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
        Node b = new Node(2);
        Node c = new Node(2);
        Node d = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        System.out.println(palindrome(a));


    }
}
