package test.practice.example.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal_3 {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(15);
        root.left.left=new Node(30);

        root.right=new Node(20);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        root.right.left.left=new Node(60);
        root.right.left.right=new Node(70);

        Print_levelOrderTraversal(root);
        System.out.println("---------------------------print to specific line-----------");
      //  Print_inLine_levelOrderTraversal(root);
        levelOrderTraversal_Itrative(root);
    }

    public static void Print_levelOrderTraversal(Node root){
     if (root==null)
         return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while (q.isEmpty()==false){
            Node curr=q.poll();
            System.out.println(curr.data);
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
    }

    //when we need to print data in there levelorder traversal in specific line
//    10
//    15 20
//    30 40 50
//    60 70

    public static void Print_inLine_levelOrderTraversal(Node root){
        if (root==null)
            return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while (q.size()>1){
            Node curr=q.poll();

            if (curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if (curr.left!=null)
                q.add(curr.left);
            if (curr.right!=null)
                q.add(curr.right);
        }
    }


    public static void levelOrderTraversal_Itrative(Node root){
        if (root==null)
            return;

        Queue<Node>q=new LinkedList<>();
        q.add(root);

        while (q.isEmpty()==false){
            int count=q.size();

            for (int i=0;i<count;i++){
                Node curr=q.poll();
                System.out.print(curr.data+" ");

                if (curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
            }
            System.out.println();
        }
    }
}


//            10
//        15      20
//      30      40   50
//            60  70