package Trees.Questions;

public class MaxOfBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int GetMax(Node root){
        if (root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = GetMax(root.left);
        int c = GetMax(root.right);
        return Math.max(a, Math.max(b,c));

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(-2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(2);
        Node d = new Node(30);
        a.left = c;
        a.right = d;
        Node g = new Node(-8);
        c.left = g;
        Node e = new Node(2);
        Node f = new Node(3);
        b.left = e;
        b.right = f;
        Node h = new Node(9);
        f.right = h;
        System.out.println(GetMax(root));
    }
}
