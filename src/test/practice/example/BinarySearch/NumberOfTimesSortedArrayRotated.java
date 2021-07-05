package test.practice.example.BinarySearch;

public class NumberOfTimesSortedArrayRotated {

    public static int noOfTimesArrayRotated(int[] arr){
        if(arr[0]<arr[arr.length-1]) return 0;
        int length=arr.length;
        int start=0,end=length-1;

        while (start<=end){
            int mid=start+((end-start)/2);
            int next=(mid+1)%length;
            int prev=(mid-1+length)%length;

            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev])
                return mid;
            else if(arr[start]<=arr[mid])
                start=mid+1;
            else if(arr[mid]<=arr[end])
                end=mid-1;
        }

        return -1;
    }

    public static void main(String[]args){
        //int[] arr={10,11,12,1,2,3,4,5,6,7,8};
        int[] arr={5, 1, 2, 3, 4};
       // int[] arr={1,2,3,4,5,6,7,8,10,10,10,10,11,12};
        System.out.println(noOfTimesArrayRotated(arr));

    }
}
