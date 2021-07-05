package test.practice.example.BinarySearch;

public class FindElementInInfiniteSortedArray {
    public static int findPos(int[]arr, int no){
        // As we dont kno the end index, as this array is infinite
        //we will find the range in between the no falls in
        int start=0,end=1;

        while (arr[end]<no){
            start=end;
            end=end*2;
        }

        System.out.println("start:: "+start);
        System.out.println("end::"+end);
        //binary search between start and end(after getting the range)
        while (start<=end){
            int mid=start+((end-start)/2);

            if(arr[mid]==no)
                return mid;
            else if (arr[mid]<no){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[]args){
        int arr[] =  {3, 5, 7, 9, 10, 90, 100, 130,140, 160, 170};
        int no=170;
        System.out.println(findPos(arr, no));
    }
}
