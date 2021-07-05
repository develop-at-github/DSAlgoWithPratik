package test.practice.example.BinarySearch;

public class MaxInBitonicArray {
    public static int peakElement(int[]arr){
        int n=arr.length;
        int start=0,end=n-1;
        int peakElement=-1;

        if (n==1)return 0;
        while (start<=end){
            int mid=start+((end-start)/2);

            if (mid>0 && mid<n-1){
                if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1])
                    return mid;
                else if(arr[mid]<arr[mid-1])
                    end=mid-1;
                else
                    start=mid+1;
            }
            else if (mid==0){
               if (arr[mid]>arr[mid+1])
                   return 0;
            }
            else if (mid==n-1){
                if (arr[mid]>arr[mid-1])
                    return n-1;
            }

        }
        return -1;
    }
    public static void main(String[]args){
        int arr[] =  {10,20,30,40,20,10};
        System.out.println("============== "+peakElement(arr));
    }
}
