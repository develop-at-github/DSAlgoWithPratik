package Scaler.String;

public class RotateString {
    public static void main(String[] args) {
     String str="scaler";
     int rotateNoOfTimes=2;
     System.out.println(solve(str,rotateNoOfTimes).toString());
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
