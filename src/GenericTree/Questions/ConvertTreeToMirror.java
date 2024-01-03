package GenericTree.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.util.Collections.reverse;

public class ConvertTreeToMirror {
    public static class Node {
        int val;
        List<Node> child;
        Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }
    public static void formTree(Node root) {
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }
    public static void mirrorTree(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Node> currentLevel = new ArrayList<>();
            while (levelSize-- > 0) {
                Node currentNode = q.peek();
                currentLevel.add(currentNode);
                q.remove();
                int noOfChildren = currentNode.child.size();
                for (int i = 0; i < noOfChildren; i++) {
                    q.add(currentNode.child.get(i));
                }
            }
            reverse(currentLevel);
            printNodeList(currentLevel);
        }
    }
    public static void printNodeList(List<Node> nodeList) {
        for (int i = 0; i < nodeList.size(); i++) {
            System.out.print(nodeList.get(i).val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        mirrorTree(root);
    }
}
