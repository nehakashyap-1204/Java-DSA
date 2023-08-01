package Stacks.Questions;

public class LLImplementation {
    public static class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class LLStack{
        private Node head = null;
        private int size = 0;

        void push(int x) {
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int size() {
            return size;
        }
        int pop() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek() {
            if (head == null) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }
        void displayRec(Node h){
            if (h == null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }
        void display() {
            displayRec(head);
            System.out.println();
        }
        void displayRev() {
           Node temp = head;
           while (temp != null) {
               System.out.print(temp.val +" ");
               temp = temp.next;
           }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(7);
        st.push(9);
        st.display();
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(3);
        st.display();
        System.out.println(st.peek());

    }
}
