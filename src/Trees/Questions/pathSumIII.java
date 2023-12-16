package Trees.Questions;

public class pathSumIII {
    static int count = 0;
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        Node a = new Node(5);
        Node b = new Node(-3);
        root.left = a;
        root.right = b;
        Node c = new Node(3);
        Node d = new Node(2);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        Node f = new Node(3);
        Node g = new Node(2);
        c.left = f;
        c.right = g;
        Node h = new Node(1);
        d.right = h;
        int ans =  pathSum(root, 8);
        System.out.println(ans);
    }
    public static int pathSum(Node root, int targetSum) {
        if (root == null) return 0;
        helper(root, targetSum, 0);
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);
        return count;
    }
    public static void helper(Node root, int targetSum, int currentSum) {
        if (root == null) {
            return;
        }
        currentSum += root.val;
        if(currentSum == targetSum) {
            count++;
        }
        helper(root.left, targetSum, currentSum);
        helper(root.right, targetSum, currentSum);
    }
}

