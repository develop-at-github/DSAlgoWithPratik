package Scaler.ProblemSolving;

public class PickFromBothSides {
    public static void main(String[] args) {
        int[]arr={5, -2, 3 , 1, 2};
        int maxLengthOfSubarray=3;
        System.out.println(maxSumSubarray(arr,3));
    }

    public static int maxSumSubarray(int[] arr,int maxLengthOfSubarray){
        int maxSum=0;

        int tempMax=0;
        for (int i=0;i<maxLengthOfSubarray;i++)
            tempMax+=arr[i];

        maxSum=tempMax;

        for (int i=maxLengthOfSubarray-1,j=arr.length-1;i>=0;i--,j--){
            tempMax-=arr[i];
            tempMax+=arr[j];

            maxSum=Math.max(tempMax,maxSum);
        }

        return maxSum;
    }
}
