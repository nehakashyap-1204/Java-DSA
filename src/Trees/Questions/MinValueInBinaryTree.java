package Trees.Questions;

public class MinValueInBinaryTree {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static int GetMin(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = GetMin(root.left);
        int c = GetMin(root.right);
        return Math.min(a, Math.min(b,c));
    }
    public static void main(String[] args) {
        Node root = new Node(75);
        Node a = new Node(81);
        Node b = new Node(61);
        root.left = a;
        root.right = b;
        Node c = new Node(1);
        Node d = new Node(38);
        a.left = c;
        a.right = d;
        Node e = new Node(47);
        Node f = new Node(25);
        b.left = e;
        b.right = f;
        Node g = new Node(18);
        c.left = g;
        Node h = new Node(8);
        Node i = new Node(80);
        f.left = h;
        f.right = i;
        System.out.println(GetMin(root));
    }
}
