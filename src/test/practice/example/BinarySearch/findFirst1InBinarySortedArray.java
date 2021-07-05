package test.practice.example.BinarySearch;

public class findFirst1InBinarySortedArray {
    public static int findPos(int[] arr){
        int start=0,end=1;
        int index=-1;

        while (arr[end]!=1){
            start=end;
            end=end*2;
        }

        while (start<=end){
            int mid=start+((end-start)/2);

            if(arr[mid]==1){
                index=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
            }

        }

        return index;
    }
    public static void main(String[]args){
        int arr[] =  {0, 0, 1, 1, 1, 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(findPos(arr));
    }
}
