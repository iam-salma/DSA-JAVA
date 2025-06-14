package BinaryTrees;

import java.util.*;

public class TreeConcepts{
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if (nodes[idx] == -1){
                return null;
            }
            
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }

    static void pre_order(Node root) {
        if (root == null)
                return;
            System.out.print(root.data+ " ");
            pre_order(root.left);
            pre_order(root.right);
        }

    static void in_order(Node root) {
        if (root == null)
                return;
        in_order(root.left);
        System.out.print(root.data+ " ");
        in_order(root.right);
        }

    static void post_order(Node root) {
        if (root == null)
                return;
        post_order(root.left);
        post_order(root.right);
        System.out.print(root.data+ " ");
        }

    static void level_order(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if (currNode == null){
                if (q.isEmpty())
                    return;
                else
                    q.add(null);
            } else {
                System.out.print(currNode.data + " ");
                if(currNode.left != null)
                    q.add(currNode.left);
                if(currNode.right != null)
                    q.add(currNode.right);
            }
        }
    }

    static int count_nodes (Node root) {
        if (root == null)
            return 0;
        int left_nodes = count_nodes(root.left);
        int right_nodes = count_nodes(root.right);

        return left_nodes + right_nodes + 1;
    }

    static int sumOfNodes (Node root) {
        if (root == null)
            return 0;
        int left_sum = sumOfNodes(root.left);
        int right_sum = sumOfNodes(root.right);

        return left_sum + right_sum + root.data;
    }

    static int heightOfTree (Node root) {
        if (root == null)
            return 0;
        int left_height = heightOfTree(root.left);
        int right_height = heightOfTree(root.right);

        return Math.max(left_height,right_height) + 1;
    }

    static int diameter (Node root) {
        if (root == null)
            return 0;
        int left_diameter= diameter(root.left);
        int right_diameter = diameter(root.right);
        int root_diameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        return Math.max(root_diameter, Math.max(left_diameter, right_diameter));
    }

    static class TreeInfo{
        int ht;
        int diam;

        TreeInfo(int ht, int diam){
            this.ht = ht;
            this.diam = diam;
        }
    }

    static TreeInfo diameter2 (Node root){
        if(root == null)
            return new TreeInfo(0, 0);

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);
        int myHeight = Math.max(left.ht, right.ht) + 1;
        
        int left_diam = left.diam;
        int right_diam = right.diam;
        int root_diam = left.ht + right.ht + 1;

        int myDiam = Math.max(root_diam, Math.max(left_diam, right_diam));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
        return myInfo;
    }

    static boolean isIdentical (Node root, Node subRoot){
        if (root == null && subRoot == null)
            return true;
        if (root == null || subRoot == null)
            return false;

        return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
    }

    static boolean isSubtree(Node root, Node subRoot){
        if (subRoot == null)
            return true;
        if (root == null)
            return false;
        if (root.data == subRoot.data)
            return isIdentical (root, subRoot);
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int subtree_nodes[] = {3, -1, 6, -1, -1};
        // BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);

        BinaryTree.idx = -1;
        Node subRoot = BinaryTree.buildTree(subtree_nodes);

        System.out.println("preorder :");
        pre_order(root);
        System.out.println("\ninorder :");
        in_order(root);
        System.out.println("\npostorder :");
        post_order(root);
        System.out.println("\nlevelorder :");
        level_order(root);
        System.out.println("no. of nodes: "+ count_nodes(root));
        System.out.println("sum of nodes: "+ sumOfNodes(root));
        System.out.println("height of tree: "+ heightOfTree(root));
        System.out.println("diameter of tree O(n^2): "+ diameter(root));
        System.out.println("diameter of tree O(n): "+ diameter2(root).diam);
        System.out.println("subtree Matches?: "+ isSubtree(root,subRoot));
    }
} // time comp for all funcs is O(n)