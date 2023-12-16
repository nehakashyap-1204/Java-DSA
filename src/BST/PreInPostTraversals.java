package BST;

import java.util.LinkedList;
import java.util.Queue;

public class PreInPostTraversals {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static Node constructBFS(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        int i = 1;
        while (i < n-1) {
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if (arr[i].equals("")){
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i+1].equals("")){
                right = null;
            } else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }
    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","6","7"};
        Node root = constructBFS(arr);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
