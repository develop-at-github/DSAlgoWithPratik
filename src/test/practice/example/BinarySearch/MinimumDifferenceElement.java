package test.practice.example.BinarySearch;

public class MinimumDifferenceElement {  // IMP
    public static int MinimumDifferenceNo(int[] arr,int no){
        int n=arr.length;
        int start=0,end=n-1;

        while (start<=end){
            int mid=start+((end-start)/2);

            if (arr[mid]==no)
                return 0;
            else if (arr[mid]>no)
                end=mid-1;
            else
                start=mid+1;
        }

        int a=Math.abs(arr[start]-no);
        int b=Math.abs(arr[end]-no);

        return a<b?a:b;
    }

    public static void main(String[]args){
        int arr[] =  {1,2,8,10,11,15,19};
        int no=5;
        System.out.println(MinimumDifferenceNo(arr,no));
    }
}
