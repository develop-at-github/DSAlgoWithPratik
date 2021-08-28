package test.practice.example.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewOfTree_5 {
    static int maxLevel=0;
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(15);
        root.left.left=new Node(30);

        root.right=new Node(20);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        root.right.left.left=new Node(60);
        root.right.left.right=new Node(70);

       // printLeftView(root,1);
        printLeftView_Using_ItrativeMethod(root);
    }

//            10
//        15      20
//      30      40   50
//            60  70
    public static void printLeftView(Node root,int level){
        if (root==null)
            return;

        if (maxLevel<level){
            System.out.println(root.data);
            maxLevel=level;
        }
        printLeftView(root.left,level+1);
        printLeftView(root.right,level+1);
    }

//levelOrderTraversal_Itrative(Node root) function used in LevelOrderTraversal_3 class
    public static void printLeftView_Using_ItrativeMethod(Node root){
        if (root==null) return;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while (q.isEmpty()==false){
            int count=q.size();

            for (int i=0;i<count;i++){
                Node curr=q.poll();
                if (i==0)               // this is the only diff from levelOrderTraversal_Itrative function
                    System.out.println(curr.data);

                if (curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
            }
        }
    }
}
