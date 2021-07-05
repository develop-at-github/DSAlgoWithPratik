package test.practice.example.BinarySearch;

public class SearchingInNearlySortedArray {
    public static int SearchInNearlySortedArray(int[] arr,int no){
        int n=arr.length;
        int start=0,end=n-1;

        while(start<=end){
            int mid=start+((end-start)/2);

            if (arr[mid]==no)
                return mid;
            if (mid-1>=start && arr[mid-1]==no)
                return mid-1;
            if (mid+1<=end && arr[mid+1]==no)
                return mid+1;
            if(no<arr[mid])
                end=mid-2;
            else if(no>arr[mid])
                start=mid+2;
        }

        return -1;
    }
    public static void main(String[]args){
        int arr[] =  {10, 3, 40, 20, 50, 80, 70};
        int no=80;
        System.out.println(SearchInNearlySortedArray(arr,no));

    }
}
