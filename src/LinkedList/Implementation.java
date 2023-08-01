package LinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        void insertAtHead(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void insertAt(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (idx == size) {
                insertAtEnd(val);
                return;
            }
            if (idx == 0) {
                insertAtHead(val);
                return;
            }
            for (int i = 1; i <= idx -1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        int getAt(int idx) {
            Node temp = head;
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx) {
            Node temp = head;
            if (idx == 0) {
                head = head.next;
                size--;
                return;
            }
            if (idx == size-1) {
                tail = temp;
            }
            for (int i = 1; i <= idx -1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(2);
        ll.insertAtEnd(4);
        ll.insertAtEnd(6);
        ll.insertAtEnd(8);
        ll.insertAtEnd(10);
        ll.insertAtHead(12);
        ll.insertAt(0,109);

        ll.display();
        System.out.println();
//        System.out.println(ll.head.data);
//        System.out.print(ll.size());
//        System.out.println(ll.getAt(6));
//        System.out.println(ll.size);
        ll.deleteAt(0);
        ll.display();



    }
}
