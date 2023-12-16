package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static void nthLevel(Node root, int n) {  // left to right
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.val+" ");
            return;
        }
        nthLevel(root.left, n-1);
        nthLevel(root.right, n-1);
    }
    public static void nthLevel2(Node root, int n) {
        if (root == null) return;
        if (n == 1) {
            System.out.print(root.val+" ");
            return;
        }
        nthLevel2(root.right, n-1);
        nthLevel2(root.left, n-1);
    }
    public static int GetHeight(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(GetHeight(root.left) , GetHeight(root.right));
    }

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        if (root != null) q.add(root);
        while (q.size() > 0) {
            Node temp = q.peek();
            if (temp.left != null) q.add(temp.left);
            if (temp.right != null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
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
//       int level = GetHeight(root) + 1;
//        for (int i = 1; i <= level; i++) {
//            nthLevel(root, i);
//            System.out.println();
//        }
        bfs(root);
//        nthLevel(root, 3);
    }
}
