package test.practice.example.SlidingWindow;



public class SlidingWindow_Variable_1 {
    public static int findMaxLength(int [] arr, int requiredSum){
        int i=0,j=0;  // start and end point of the window
        int size=arr.length;

        int maxLenght=Integer.MIN_VALUE;
        int sum=0;


        while (j<size){
            sum+=arr[j];


            if(sum<requiredSum){
                j++;
            }
            else if(sum==requiredSum){
                maxLenght=Math.max(maxLenght,(j-i+1));

                sum-=arr[i];

                j++;
                i++;
            }

            while (sum>requiredSum & i<j){
                sum-=arr[i];
                i++;
            }
        }

        return maxLenght;
    }
    public static void main(String[]args){
        int [] arr={4,1,1,1,2,3,5};
        int requiredSum=5;

        System.out.println(findMaxLength(arr,requiredSum));
    }
}
