package test.practice.example.SlidingWindow;

public class SlidingWindow_fixed_1 {
    public static int findMaxSumWindow(int [] arr,int k){
        int i=0,j=0;  // start and end point of the window
        int size=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;

        while (j<size){
            sum+=arr[j];

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxSum=Math.max(maxSum,sum);

                sum-=arr[i];
                j++;
                i++;
            }
        }

        return maxSum;
    }
    public static void main(String[]args){
        int [] arr={2,3,1,5,5,5,7,8,9};
        int windowSize=3;
        System.out.println(findMaxSumWindow(arr,windowSize));
    }
}
