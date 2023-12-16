package Trees.Questions;

public class LCAofBT {
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static boolean contains(Node root, Node node) {
        if(root == null) return false;
        if (root == node) return true;
        return contains(root.left, node) || contains(root.right, node);
    }
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (p == root || q == root) return root;
        if (p == q) return p;
        boolean leftp = contains(root.left, p);
        boolean rightq = contains(root.right, q);
        if (leftp && rightq) return root;
        if (leftp && !rightq) return lowestCommonAncestor(root.left, p, q);
        if (!leftp && rightq) return lowestCommonAncestor(root.right, p, q);
        return root;
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
        Node g = new Node(6);
        c.left = g;
        Node e = new Node(7);
        Node f = new Node(8);
        b.left = e;
        b.right = f;
        Node h = new Node(9);
        f.right = h;
        Node ans =  lowestCommonAncestor(root, f, h);
        System.out.println(ans.val);
    }
}
