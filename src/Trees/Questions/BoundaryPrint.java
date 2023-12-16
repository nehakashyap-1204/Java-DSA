package Trees.Questions;

import java.util.LinkedList;
import java.util.Queue;

public class BoundaryPrint {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
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
        String[] arr = {"1","2","3","4","5","","6","7","","8","","9","10","","11","","12","","13","","14","15","16","","17","","","18","","19","","","","20","21","22","23","","24","25","26","27","","","28","",""};
        Node root = constructBFS(arr);
        boundaryDisplay(root);
    }

    private static void boundaryDisplay(Node root) {
        LeftBoundary(root);
        System.out.println();
        BottomBoundary(root);
        System.out.println();
        RightBoundary(root.right);
    }

    private static void RightBoundary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        if (root.right != null) RightBoundary(root.right);
        else RightBoundary(root.left);
        System.out.print(root.val+" ");
    }

    private static void BottomBoundary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.print(root.val+" ");
            return;
        }
        BottomBoundary(root.left);
        BottomBoundary(root.right);
    }

    private static void LeftBoundary(Node root) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        System.out.print(root.val+" ");
        if (root.left != null) LeftBoundary(root.left);
        else LeftBoundary(root.right);
    }
}
