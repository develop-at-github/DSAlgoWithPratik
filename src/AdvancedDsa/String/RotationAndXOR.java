package AdvancedDsa.String;

public class RotationAndXOR {
    public static void main(String[] args) {
        String A="1001";
        String B="0011";
        System.out.println(findCountOfXORs(A,B));
    }

    public static int findCountOfXORs(String A, String B) {
        char[] arr=A.toCharArray();
        int i=0,j=A.length()-1;

    }

    public static String solve(String A, int B) {
        char[]arr=A.toCharArray();
        char[] temp=new char[A.length()];
        B=B%A.length();
        for (int i=A.length()-B,j=0;i<A.length();i++,j++){
            temp[j]=arr[i];
        }

        for (int i=0,j=B;i<A.length()-B;i++,j++){
            temp[j]=arr[i];
        }

//        for (char c:temp)
//            System.out.println(c);
        return new String(temp);
    }

}
