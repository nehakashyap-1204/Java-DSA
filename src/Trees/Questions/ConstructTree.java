package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructTree {
    public static class Node {
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
    public static int GetHeight(Node root){
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 0;
        return 1 + Math.max(GetHeight(root.left) , GetHeight(root.right));
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

    public static void main(String[] args) {
        String[] arr = {"1","2","3","4","5","6","7","","8","9","","10","11","","12"};

        Node root = constructBFS(arr);
        int level = GetHeight(root) + 1;
        for (int i = 1; i <= level; i++) {
            nthLevel(root, i);
            System.out.println();
        }
    }
}
