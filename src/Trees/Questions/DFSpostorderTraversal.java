package Trees.Questions;

import java.util.Stack;

public class DFSpostorderTraversal {
        public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        postorderTraversal(root);
    }
    public static void postorderTraversal(Node root){
            Stack<Node> st1 = new Stack<Node>();
            Stack<Node> st2 = new Stack<Node>();
            st1.push(root);
            while (st1.size() > 0) {
                Node temp = st1.pop();
                st2.push(temp);
                if (temp.left != null){
                    st1.push(temp.left);
                }
                if (temp.right != null) {
                    st1.push(temp.right);
                }
            }
            while (st2.size() > 0){
                Node temp = st2.pop();
                System.out.print(temp.val+" ");
            }
    }
}
