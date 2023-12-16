package BST;

public class BSTfromPreorder {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        //insertion
        if (root.val > val) {  // go left
            if (root.left == null) root.left = new TreeNode(val);
            else insertIntoBST(root.left, val);
        }
        if (root.val < val) { // go right
            if (root.right == null) root.right = new TreeNode(val);
            else insertIntoBST(root.right, val);
        }
        return root;
    }
    public static TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        for (int i = 1; i < preorder.length; i++) {
            root = insertIntoBST(root, preorder[i]);
        }
        preOrder(root);
        return root;
    }
    public static void preOrder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        bstFromPreorder(preorder);

    }
}
