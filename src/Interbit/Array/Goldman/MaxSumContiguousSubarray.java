package Interbit.Array.Goldman;

public class MaxSumContiguousSubarray {
    public static int maxSum(int[] A){
        int n=A.length;
        if (A.length==0) return 0;

        int max_ContigiousArray_Sum=A[0];
        int current_ContigiousArray_Sum=A[0];

        for(int i=1;i<n;i++){
            current_ContigiousArray_Sum+=A[i];

            if (current_ContigiousArray_Sum>A[i]){

            }
            else{
                current_ContigiousArray_Sum=A[i];
            }
            max_ContigiousArray_Sum=Math.max(max_ContigiousArray_Sum,current_ContigiousArray_Sum);
        }

        return max_ContigiousArray_Sum;
    }
    public static void main(String[] args) {
        //int[] A = {1, 2, 3, 4, -10};
        //int[] A={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] A={4,-1,2,1};
        System.out.println(maxSum(A));
    }
}
