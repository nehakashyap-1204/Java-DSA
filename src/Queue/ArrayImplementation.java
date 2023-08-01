package Queue;

public class ArrayImplementation {
    public static class queueA{
        int[] arr = new int[100];
        int f = -1;
        int r = -1;
        int size = 0;
        public void add(int val){
            if (r == arr.length -1){
                System.out.print("Queue is full!");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[++r] = val;
            }
            size++;
        }
        public void remove() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                // if return type is int :
                // return;
            }
            f++;
            size--;
            // return arr[f-1];
        }
        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }
        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
