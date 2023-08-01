package Stacks.Questions;

public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;
        void push(int x){
            if (isFull()) {
                System.out.println("Stack is Full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx -1];
        }
        int pop() {
            int top = arr[idx -1];
            arr[idx -1] = 0;
            idx--;
            return top;
        }
        int size() {
            return idx;
        }
        boolean isEmpty() {
            if (idx == 0)
                return true;
            else
                return false;
        }
        boolean isFull() {
            if (idx == arr.length)
                return true;
            else
                return false;
        }
        void display() {
            for (int i = 0; i <= idx -1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        int capacity() {
            return arr.length;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(7);
        st.push(9);
        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(8);
        st.push(5);
        st.push(6);
        st.push(3);
        st.display();
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.isFull());
        System.out.println(st.capacity());
    }
}
