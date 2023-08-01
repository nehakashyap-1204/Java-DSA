package LinkedList.Questions;

public class IntersectionOfTwoLL {
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node tempA = headA;
        Node tempB = headB;
        int lengthA = 0;
        while (tempA != null) {
            lengthA++;
            tempA = tempA.next;
        }
        int lengthB = 0;
        while (tempB != null) {
            lengthB++;
            tempB = tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for(int i = 1; i <= steps; i++) {
                tempA = tempA.next;
            }
        }
        if (lengthB > lengthA) {
            int steps = lengthB - lengthA;
            for(int i = 1; i <= steps; i++) {
                tempB = tempB.next;
            }
        }
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node a2 = new Node(9);
        Node a3 = new Node(10);
        Node c1 = new Node(2);
        Node c2 = new Node(4);
        Node b1 = new Node(3);

        a1.next = a2;
        a2.next = a3;
        a3.next = c1;
        c1.next = c2;
        b1.next = c1;

       Node temp =  getIntersectionNode(a1, b1);
        System.out.println(temp.data);

    }
}
