package GenericTree.Questions;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static class Node {
        int val;
        List<Node> child;
        Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }
    public static void formTree(Node root) {
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }
    public static void postOrderTraversal(Node root) {
        if (root.child.isEmpty()) {
            System.out.print(root.val + " ");
            return;
        }
        int n = root.child.size();
        for (int i = 0; i < n; i++) {
            postOrderTraversal(root.child.get(i));
        }
        System.out.print(root.val + " ");
    }
    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        postOrderTraversal(root);
    }
}
