package test.practice.example.BinarySearch;

public class simpleBinarySearch {
    public static int findIndexOfNum(int[] a,int no){
        int start=0,end=a.length-1;

        while (start<=end){
            int mid=start+((end-start)/2) ;

            if(a[mid]==no)
                return mid;
            else if(no<a[mid])
                end=mid-1;
            else
                start=mid+1;
        }

        return -1;
    }
    public static void main(String[]args){
       int[] a={1,2,3,4,5,6,7,8,9,10};
        int no=2;
        System.out.println(findIndexOfNum(a,no));
    }
}
