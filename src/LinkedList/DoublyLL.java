package LinkedList;

public class DoublyLL {
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayRev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random) {
        Node temp = random;
        // move this temp backwards to the head
        while (temp.prev != null) {
            temp = temp.prev;
        }
        // now temp is at head
        // print the list
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int x) {
        Node t = new Node(x);
        t.next = head;
        head.prev = t;
        head = t;
        return head;
    }
    public static void insertAtTail(Node head, int x) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;
    }
    public static void insertAtIdx(Node head, int idx, int x) {
        Node s = head;
        for (int i = 1; i <= idx -1; i++) {
            s = s.next;
        }
        Node r = s.next;
        Node t = new Node(x);
        t.prev = s;
        s.next = t;
        t.next = r;
        r.prev = t;
//        temp.next.prev = t;
//        t.prev = temp;
//        t.next = temp.next;
//        temp.next = t;

    }

    public static Node deleteElement(Node head, int idx) {
        Node temp = head;
        if (idx == 0){
            head = head.next;
            head.prev = null;
        }
        for (int i = 1; i <= idx -1; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            temp.prev.next = null;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val) {
           this.val = val;
        }
    }


    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
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
//        display(a);
//        displayRev(e);
//        displayRandom(d);

//       display(a);
//       Node newHead =  insertAtHead(a,1);
//       display(newHead);

//        display(a);
//        insertAtTail(a, 100);
//        display(a);

//        display(a);
//        insertAtIdx(a, 3, 55);
//        display(a);

        display(a);
        Node temp3 = deleteElement(a, 4);
        display(temp3);
    }
}
