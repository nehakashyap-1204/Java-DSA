package Queue;

public class CircularQueueLL {
    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public static class cqll {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            tail.next = head;
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
            }
            int data = head.val;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return data;
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            return head.val;
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }

        public void display() {
            Node temp = head;
            if (size == 0) {
                System.out.println("Empty");
            } else
                while (temp != tail) {
                    System.out.print(temp.val+" ");
                    temp = temp.next;
                }
            }
        }
    public static void main(String[] args) throws Exception{
        cqll q1 = new cqll();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.remove();
        System.out.println(q1.peek());
        q1.display();

    }
}
