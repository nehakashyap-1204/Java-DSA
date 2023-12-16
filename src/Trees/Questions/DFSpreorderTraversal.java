package Trees.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSpreorderTraversal {
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
        preorderTraversal(root);
    }
    public static void preorderTraversal(Node root){
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        while (st.size() > 0) {
            Node temp = st.pop();
            System.out.print(temp.val+" ");
            if (temp.right != null){
                st.push(temp.right);
            }
            if (temp.left != null) {
                st.push(temp.left);
            }
        }

    }
}
