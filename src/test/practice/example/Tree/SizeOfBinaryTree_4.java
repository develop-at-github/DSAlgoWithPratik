package test.practice.example.Tree;

public class SizeOfBinaryTree_4 {
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(15);
        root.left.left=new Node(30);

        root.right=new Node(20);
        root.right.left=new Node(40);
        root.right.right=new Node(50);

        root.right.left.left=new Node(60);
        root.right.left.right=new Node(70);

        System.out.println(getTheSizeOfTree(root));
        System.out.println(maxInBinaryTree(root));
    }

    public static int getTheSizeOfTree(Node root){
        if (root==null)
            return 0;

       return getTheSizeOfTree(root.left)+getTheSizeOfTree(root.right)+1;
    }

    public static int maxInBinaryTree(Node root){
        if (root==null)
            return Integer.MIN_VALUE;

        return Math.max(root.data,Math.max(maxInBinaryTree(root.left),maxInBinaryTree(root.right)));
    }
}
