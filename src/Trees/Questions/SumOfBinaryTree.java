package Trees.Questions;

public class SumOfBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int GetSum(Node root) {
        if (root == null) return 0;
        return root.val + GetSum(root.left) + GetSum(root.right);
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
        Node g = new Node(8);
        c.left = g;
        Node e = new Node(6);
        Node f = new Node(7);
        b.left = e;
        b.right = f;
        Node h = new Node(9);
        f.right = h;
        System.out.println(GetSum(root));
    }
}
