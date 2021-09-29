package Scaler.ProblemSolving;

public class SubarrayWithLeastAverage {
    public static void main(String[] args) {
        int[]arr={3, 7, 5, 20, -10, 0, 12};
        int b=2;
        System.out.println(minSumSubarray(arr,b));
    }

    public static int minSumSubarray(int[]arr,int b){
        int res=0;
        int minSum=Integer.MAX_VALUE;

        int start=0;
        int end=0;
        int sum=0;
        while (end<arr.length){
            if (end-start+1<b){
                sum+=arr[end];
            }
            else if (end-start+1==b){
                sum+=arr[end];
                if (minSum>sum) {
                    res = start;
                    minSum = sum;
                }
                sum-=arr[start];
                start++;
            }
            end++;
        }

        return res; //starting index of window with lowest sum
    }
}
