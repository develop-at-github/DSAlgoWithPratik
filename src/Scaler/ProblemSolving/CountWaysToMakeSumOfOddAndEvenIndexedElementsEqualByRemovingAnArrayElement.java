package Scaler.ProblemSolving;

public class CountWaysToMakeSumOfOddAndEvenIndexedElementsEqualByRemovingAnArrayElement {
    public static void main(String[] args) {
        int[]arr={2, 1, 6, 4};
        System.out.println(oddEvenSumEqualCount(arr));
    }

    public static int oddEvenSumEqualCount(int[] arr){
        int res=0;
        int totalRightOddElementSum=0;
        int totalRightEvenElementSum=0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0)
                totalRightEvenElementSum+=arr[i];
            else
                totalRightOddElementSum+=arr[i];
        }

        int leftEvenSum=0;
        int leftOddSum=0;
        for (int i=0;i<arr.length;i++){
            if (i%2==0)
                totalRightEvenElementSum-=arr[i];
            else
                totalRightOddElementSum-=arr[i];

            if (leftEvenSum+totalRightOddElementSum == leftOddSum+totalRightEvenElementSum)
                res++;

            if (i%2==0)
                leftEvenSum+=arr[i];
            else
                leftOddSum+=arr[i];
        }
        return res;
    }
}
