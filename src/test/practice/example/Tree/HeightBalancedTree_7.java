package test.practice.example.Tree;

public class HeightBalancedTree_7 {

    //when trees left and right subtree height difference is not greater than 1
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(12);
        root.left.left=new Node(13);
        root.left.right=new Node(14);

        root.right=new Node(15);
        root.right.right=new Node(16);
        root.right.right.right=new Node(30);


        //    System.out.println(isTreeBalanced(root));
        System.out.println(isTreeBalanced_without_calculating_HeightSeprately(root));

    }

    //solution 1 with time complexity= O( n^2)
    public static int heightOfTree(Node root){
        if (root==null)
            return 0;

        return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
    }

    public static boolean isTreeBalanced(Node root){
        if (root==null)
            return true;

        int lh=heightOfTree(root.left);
        int rh=heightOfTree(root.right);

       return Math.abs(lh-rh)<=1 && isTreeBalanced(root.left) && isTreeBalanced(root.right);
    }

    //solution 1 end

    //solution 2 with time complexity= O( n )
    public static int isTreeBalanced_without_calculating_HeightSeprately(Node root){
        if (root==null)
            return 0;

        int lh=isTreeBalanced_without_calculating_HeightSeprately(root.left);
        if (lh==-1)
            return -1;

        int rh=isTreeBalanced_without_calculating_HeightSeprately(root.right);
        if (rh==-1)
            return -1;

        return Math.abs(lh-rh) <=1 ? Math.max(lh,rh)+1 : -1 ;
    }

}
