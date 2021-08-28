package test.practice.example.Tree;

public class ChildrenSumProperty_6 {
    public static void main(String[] args) {
        Node root=new Node(20);
        root.left=new Node(8);
        root.left.left=new Node(3);
        root.left.right=new Node(5);

        root.right=new Node(13);

        System.out.println(isTreeChildrenSUm(root));
    }


    public static boolean isTreeChildrenSUm(Node root){
        if (root==null)
            return true;
        if (root.left==null && root.right==null)
            return true;

        int sum=0;
        if (root.left!=null)
            sum+=root.left.data;
        if (root.right!=null)
            sum+=root.right.data;

        return (root.data==sum) &&(isTreeChildrenSUm(root.left) && isTreeChildrenSUm(root.right));
    }
}
