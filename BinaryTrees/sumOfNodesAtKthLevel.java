package BinaryTrees;

import BinaryTrees.TreeConcepts.BinaryTree;
import BinaryTrees.TreeConcepts.Node;
import java.util.LinkedList;
import java.util.Queue;

public class sumOfNodesAtKthLevel {

    static void sumOfNodesAtKthLevel(Node root, int k){
        if (root == null || k <= 0)
            return;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int sum = 0;
        int level = 1;

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                System.out.println("");
                if (q.isEmpty())
                    break;
                else {
                    q.add(null);
                    level++;
                }
            } else {
                if (level == k)
                    sum += currNode.data;
                if (currNode.left != null)
                    q.add(currNode.left);
                if (currNode.right != null)
                    q.add(currNode.right);
            }
        }
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);

        sumOfNodesAtKthLevel(root, 2);
    }
}
