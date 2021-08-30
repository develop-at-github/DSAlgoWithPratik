package Scaler.Array;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceAG {
    public static void main(String[] args) {
        String str="ABCGAG";
        System.out.println(getSubsequence_Count(str));
    }

    public static int getSubsequence_Count(String str){
        int count=0;
        int noOf_G_TillNow=0;
        char[] charr=str.toCharArray();

        for (int i=charr.length-1;i>=0;i--){
            if (charr[i]=='G'){
                noOf_G_TillNow++;
            }
            else if (charr[i]=='A'){
                count+=noOf_G_TillNow;
            }
        }
        return count;
    }
}
