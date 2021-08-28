package test.practice.example.Tree;

import java.util.Scanner;

public class createTreeAndDFS_1 {
    public static Scanner sc=null;

    public static void main(String[] args) {
        Node root=null;
        root=createNode();

        System.out.println("inOrder----------------");
        inOrder(root);
        System.out.println("preOrder----------------");
        preOrder(root);
        System.out.println("postOrder----------------");
        postOrder(root);
    }

    public static Node createNode(){
        Node root=null;
        System.out.println("enter data: ");
        sc=new Scanner(System.in);
        int data= sc.nextInt();

        if (data==-1) return null;
        root=new Node(data);

        System.out.println("enter data for left node of "+data);
        root.left=createNode();

        System.out.println("enter data for right node of "+data);
        root.right=createNode();

        return root;
    }

    public static void inOrder(Node root){
        if (root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if (root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void postOrder(Node root){
        if (root==null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}


