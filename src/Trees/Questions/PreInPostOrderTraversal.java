package Trees.Questions;

public class PreInPostOrderTraversal {
    public static void pip(int n) { // pre in post
        if (n == 0) return;
        System.out.println("Pre " +n); // pre
        pip(n-1);
        System.out.println("In " +n); // in
        pip(n-1);
        System.out.println("Post " +n); // post
    }
    public static class Node {
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void preOrder(Node root) {
        // preOrder is root left right
        if (root == null) return;
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        // inOrder is left root right
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    public static void PostOrder(Node root){
        // inOrder is left root right
        if (root == null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.val);
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
        pip(3);
//        preOrder(root);
//        inOrder(root);
//        PostOrder(root);

    }
}
