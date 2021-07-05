package test.practice.example.BinarySearch;

public class ElementInRotatedSortedArray {

    public static int binarySearch(int[] a,int no,int start, int end){
        while (start<=end){
            int mid=start+((end-start)/2) ;

//            System.out.println("mid:: "+mid);
//            System.out.println("arr[mid]:: "+a[mid]);

            if(a[mid]==no)
                return mid;
            else if(no<a[mid])
                end=mid-1;
            else
                start=mid+1;
        }

        return -1;
    }

    public static int findElementInRotatedSortedArray(int[] arr,int no){
            //look for the min num as we did in --- number of times sorted array rotated
            // we get 2 halfs , that number will be in any one of the halfs

            int start=0,end=arr.length-1;
            int n=arr.length;
            if(arr[start]<=arr[end]) return binarySearch(arr,no,start,end);

            while (start<=end){
                int mid=start+((end-start)/2);
                int next=(mid+1)%n;
                int prev=(mid-1+n)%n;

//                System.out.println("mid:: "+arr[mid]);
//                System.out.println("next:: "+arr[next]);
//                System.out.println("prev:: "+arr[prev]);
//                System.out.println("----------------------------------- ");
                //

                if(arr[mid]==no)
                    return mid;
                else if(arr[mid]<=arr[prev] && arr[mid]<=arr[next]){
//                    System.out.println("inside -----000000000000000000");
//                    System.out.println("mid:: "+arr[mid]);
//                    System.out.println("start:: "+arr[start]);
//                    System.out.println("end:: "+arr[end]);
//                    System.out.println("arr[prev]:: "+arr[prev]);
//                    System.out.println("arr[next]:: "+arr[next]);
                    if(no>=arr[0] && no<=arr[prev])
                        return binarySearch(arr,no,0,prev);
                    else
                        return binarySearch(arr,no,next,n-1);
                }
                else if(arr[mid]>=arr[0])
                    start=mid+1;
                else if(arr[mid]<=arr[0])
                    end=mid-1;
            }
        return -1;
    }

    public static void main(String[]args){
        //int[] arr={10,11,12,1,2,3,4,5,6,7,8};
        int[] arr={4,5,6,7,0,1,2};
        int no=2;
        System.out.println(findElementInRotatedSortedArray(arr,no));

    }
}
