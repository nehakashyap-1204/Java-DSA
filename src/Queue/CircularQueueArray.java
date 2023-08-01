package Queue;

public class CircularQueueArray {
    public static class circularQueue{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val) throws Exception{
            if (size == arr.length) {
                throw new Exception("Queue is Full!");
            } else if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length -1) {
                arr[++rear] = val;
            } else if (rear == arr.length -1) {
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else {
                int val = arr[front];
                if (front == arr.length -1) front = 0;
                else front++;
                size--;
                return val;
            }
        }
        public int peek() throws Exception{
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            }
            else return arr[front];
        }
        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }
        public void display() {
            if (size == 0) {
                System.out.print("Queue is Empty!");
            } else if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            } else { // rear < front
                for (int i =front; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        circularQueue q1 = new circularQueue();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.remove();
        q1.add(4);
        q1.add(5);
        q1.display();
        System.out.println(q1.peek());
        for (int i = 0; i < q1.arr.length; i++) {
            System.out.print(q1.arr[i]+" ");
        }
    }
}
