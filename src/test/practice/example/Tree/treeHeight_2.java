package test.practice.example.Tree;

import test.practice.example.Tree.Node;

public class treeHeight_2 {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.left.left=new Node(40);
        root.left.right=new Node(50);

        root.right=new Node(30);
        root.right.right=new Node(70);

        System.out.println(heightOfTree(root));
        printNodesAtDistance_k(root,2);
    }

    public static int heightOfTree(Node root){
        if (root==null)
            return 0;

        return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
    }

    public static void printNodesAtDistance_k(Node root,int k) {
        if (root == null)
            return;

        if (k == 0)
            System.out.print(root.data + ", ");
        else {
            k--;
            printNodesAtDistance_k(root.left, k);
            printNodesAtDistance_k(root.right, k);
        }
    }
}
