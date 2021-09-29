package Scaler.Recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String str= "namans";
        System.out.println(solve(str,0,str.length()-1));
    }

    public static int solve(String str,int start,int end) {
        if (start>=end)
            return 1;
        return str.charAt(start)==str.charAt(end) && solve(str,start+1,end-1)==1 ?1:0;
    }
}
