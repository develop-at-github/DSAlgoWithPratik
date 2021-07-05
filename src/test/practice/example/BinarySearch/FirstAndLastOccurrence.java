package test.practice.example.BinarySearch;

public class FirstAndLastOccurrence {

    public static int findIndexOfFirstOccurrence(int[] arr,int no){
        int res=-1;
        int start=0,end=arr.length-1;

        while (start<=end){

            int mid=start+((end-start)/2);
          //  System.out.println("mid:: "+arr[mid]);

            if(arr[mid]==no){
                res=mid;
              //  System.out.println("res:: "+res);
                end=mid-1;
            }
            else if (no<arr[mid])
                    end=mid-1;
            else
                start=mid+1;

        }


        return res;
    }

    public static int findIndexOfLastOccurrence(int[] arr,int no){
        int res=-1;
        int start=0,end=arr.length-1;

        while (start<=end){

            int mid=start+((end-start)/2);
            //System.out.println("mid:: "+arr[mid]);

            if(arr[mid]==no){
                res=mid;
              //  System.out.println("res:: "+res);
                start=mid+1;
            }
            else if (no<arr[mid])
                end=mid-1;
            else
                start=mid+1;

        }


        return res;
    }

    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,7,8,10,10,10,10,11,12};
        int no=10;
        System.out.println(findIndexOfFirstOccurrence(arr,no));
        System.out.println(findIndexOfLastOccurrence(arr,no));

    }
}
