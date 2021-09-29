package Scaler.ProblemSolving;

import java.util.Arrays;

public class XorQueries {
    public static void main(String[] args) {
        int[]A={1,0,0,0,1};
        int[][]B={{2,4},{1,5},{3,5}};

        int[][] out=solve(A,B);

        for (int[]arr:out)
            System.out.println(Arrays.toString(arr));
    }

    public static int[][] solve(int[] A, int[][] B) {
        int[][] res=new int[B.length][2];
        int[] arr=new int[A.length];
        arr[0]=A[0];
        for (int i=1;i<A.length;i++){
            arr[i]=arr[i-1]+A[i];
        }

        System.out.println("---------"+Arrays.toString(arr)); //[1, 1, 1, 1, 2]
        for (int i=0;i<B.length;i++){                         //{{2,4},{1,5},{3,5}};
            int start=B[i][0]-1;
            int end=B[i][1]-1;

            int countOf_1=0;
            if (start!=0)
                countOf_1=arr[end]-arr[start-1];
            else
                countOf_1=arr[end];

            res[i][1]=end-start+1 - countOf_1;

            if (countOf_1 %2 !=0)
                res[i][0]=1;
            else
                res[i][0]=0;

        }
        return res;
    }
}
