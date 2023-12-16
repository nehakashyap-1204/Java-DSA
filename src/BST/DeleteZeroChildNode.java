package BST;

import Trees.Questions.ConstructTree;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteZeroChildNode {
    public static class Node {
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
        int i = 1;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (i < n-1) {
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if (arr[i].equals("")) {
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
    public static void delete0Child(Node root, int target) {
        if (root == null) return;
        if (root.val > target) { // go left
            if (root.left.val == target) root.left = null;
            else {
                delete0Child(root.left, target);
            }
        } else {
            if (root.right.val == target) root.right = null;
            else {
                delete0Child(root.right, target);
            }
        }
    }
    public static void delete1Child(Node root, int target) {
        if (root == null) return;
        if (root.val > target) { // go left
            if (root.left == null) return;
            if (root.left.val == target) {
                Node l = root.left;
                if (l.left == null && l.right ==null) root.left = null; // 0 children
                else if (l.left == null || l.right == null) {
                    if (l.left != null) root.left = l.left;
                    else root.left = l.right;
                }
            }
            else delete1Child(root.left, target);
        } else { // go right
            if (root.right == null) return;
            if (root.right.val == target) {
                Node r = root.right;
                if (r.left == null && r.right ==null) root.right = null; // 0 children
                else if (r.left == null || r.right == null) { // 1 child
                    if (r.left != null) root.right = r.left;
                    else root.right = r.right;
                }
            } else delete1Child(root.right, target);

        }
    }
    public static void main(String[] args) {
        String[] arr = {"50","20","60","17","34","55","89","10","","28","","","","70","","","14"};
        Node node = constructBFS(arr);
        preOrder(node);
        System.out.println();
//        delete0Child(node, 70);
        delete1Child(node, 10);
        preOrder(node);
    }
}
