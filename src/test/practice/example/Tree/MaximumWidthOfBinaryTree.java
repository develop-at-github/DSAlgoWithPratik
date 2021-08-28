package test.practice.example.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(30);
        root.left.left=new Node(90);
        root.left.right=new Node(100);

        root.right=new Node(20);
        root.right.left=new Node(70);
        root.right.right=new Node(300);

        System.out.println(maxWidth(root));
    }

    public static int maxWidth(Node root){
        if (root==null)
            return 0;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int maxCount=0;
        while (q.isEmpty()==false){
            int count=q.size();
            maxCount=Math.max(maxCount,count);
            for (int i=0;i<count;i++){
                Node curr=q.poll();
                if (curr.left!=null)
                    q.add(curr.left);
                if (curr.right!=null)
                    q.add(curr.right);
            }

        }

        return maxCount;
    }
}
