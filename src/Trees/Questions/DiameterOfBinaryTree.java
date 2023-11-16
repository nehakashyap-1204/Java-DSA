package Trees.Questions;

public class DiameterOfBinaryTree {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static int height(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        int a = height(root.left);
        int b = height(root.right);
        int max = 1 + Math.max(a,b);
        return max;
    }
    public static int diameterOfBinaryTree(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        int leftAns = diameterOfBinaryTree(root.left);
        int rightAns = diameterOfBinaryTree(root.right);
        int mid = height(root.left) + height(root.right);
        if (root.left != null) mid++;
        if (root.right != null) mid++;
        int max = Math.max(leftAns, (Math.max(rightAns, mid)));
        return max;
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
        System.out.println(diameterOfBinaryTree(root));
    }
}

