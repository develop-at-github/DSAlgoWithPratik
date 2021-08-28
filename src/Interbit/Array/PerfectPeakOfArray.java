package Interbit.Array;

import java.util.Arrays;

public class PerfectPeakOfArray {
    public static void main(String[] args) {
      //int[]  A = {5, 1, 4, 3, 6, 8, 10, 7, 9};
        //int[]  A = {5706, 26963, 24465, 29359, 16828, 26501, 28146, 18468, 9962, 2996, 492, 11479, 23282, 19170, 15725, 6335};
int[] A={9488, 25784, 5652, 9861, 31311, 8611, 1671, 7129, 28183, 2743, 11059, 4473, 7927, 21287, 2259, 7214, 32529};
        //int[] A = {5, 1, 4, 4};
       System.out.println(perfectPeak(A));
    }

    public static int perfectPeak(int[] A) {
        int n=A.length;
        int[] maxFromLeft=new int[n];
        int[] minFromRight=new int[n];

        maxFromLeft[0]=A[0];
        minFromRight[n-1]=A[n-1];
        for (int i=1;i<n;i++){
            maxFromLeft[i]=Math.max(A[i],maxFromLeft[i-1]);
        }

        for (int i=n-2;i>=0;i--){
            minFromRight[i]=Math.min(A[i],minFromRight[i+1]);
        }

        System.out.println("maxFromLeft: "+ Arrays.toString(maxFromLeft));
        System.out.println("maxFromRight: "+ Arrays.toString(minFromRight));
        for (int i=1;i<n-1;i++){
            // don't consider 1st and last index values as there wont be left or right side values to compare with
            if ( maxFromLeft[i-1]<A[i] && minFromRight[i+1]>A[i]) {
                return 1;
            }
        }
        return 0;
    }
}
