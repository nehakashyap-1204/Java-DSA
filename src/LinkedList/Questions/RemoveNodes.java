package LinkedList.Questions;

public class RemoveNodes {
    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(5);
        Node c = new Node(5);
    }
    public Node removeNodes(Node head) {
        if(head.next == null)
            return head;
        Node node = removeNodes(head.next);
        if(node.data > head.data)
            return node;
        head.next = node;
        return head;
    }
}
