package test.practice.example.BinarySearch;

public class findFloorOfAnElementInSortedArray {
    public static int findCeilOfNum(int[] arr,int no){
        int n=arr.length;
        int start=0,end=n-1;
        int closest_Smallest_CeilNo=Integer.MAX_VALUE;
        int ceilNoIndex=-1;

        while (start<=end){    //1,2,8,10,11,12,19
            int mid=start+((end-start)/2);

            if (arr[mid]==no)
                return mid;
            else if (arr[mid]<no)
                start=mid+1;
            else if (arr[mid]>no){
                if (closest_Smallest_CeilNo>arr[mid]){
                    closest_Smallest_CeilNo=arr[mid];
                    ceilNoIndex=mid;
                }
                end=mid-1;
            }
        }

        return ceilNoIndex;
    }
    public static int findFloorOfNum(int[] arr,int no){
        int n=arr.length;
        int start=0,end=n-1;
        int closestNoIndex=-1;
        int closestNo=Integer.MIN_VALUE;


        while (start<=end){
            int mid=start+((end-start)/2);

            if(arr[mid]==no)
                return mid;
            else if(arr[mid]>no)
                end=mid-1;
            else if(arr[mid]<no){
                if(closestNo<arr[mid]) {
                    closestNo=arr[mid];
                    closestNoIndex=mid;
                }
                start=mid+1;
            }

        }

        return closestNoIndex;
    }

    public static void main(String[]args){
        int arr[] =  {1,2,8,10,11,12,19};
        int no=16;
        System.out.println(findFloorOfNum(arr,no));
        System.out.println(findCeilOfNum(arr,no));
    }
}
