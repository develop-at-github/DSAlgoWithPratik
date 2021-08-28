package Interbit.Array.Goldman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInAnArray {
    public static int[] solve(int[] A) {
        List<Integer> list=new ArrayList<>();
        int n= A.length;
        list.add(A[n-1]);
        int currMax=A[n-1];

        for (int i=n-2;i>=0;i--){
            if(A[i]>currMax) {
                list.add(A[i]);
                currMax=Math.max(currMax,A[i]);
            }
        }

        int[] res=new int[list.size()];
        for (int i=0;i<list.size();i++)
            res[i]=list.get(i);

        return res;
    }
    public static void main(String[] args) {
        int[]A = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(solve(A)));
    }
}
