package test.practice.example.BinarySearch;

public class DesendingSortedArray {

    public static int findIndexOfNum(int[] a,int no){
        int start=0,end=a.length-1;

        while (start<=end){
            int mid=start+((end-start)/2);

            if(a[mid]==no)
                return mid;
            else if(a[mid]<no)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }


    public static void main(String[]args){
        int[] a={20,19,18,15,11,9,7,5,3,2,1};
        int no=19;
        System.out.println(findIndexOfNum(a,no));
    }
}
