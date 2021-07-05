package test.practice.example.BinarySearch;

public class MinNoOfPages {
    public static boolean isValidNoOfPages(int[] arr,int no,int arrMid){

          int countOfStudents=1;
          int pages=0;
        System.out.println("------------------------------------");
        System.out.println("arrMid:: "+arrMid);

        for (int i:arr){
              if(pages+i <= arrMid)
                    pages+=i;
              else {
                  pages=i;
                  countOfStudents++;
              }
        }
        System.out.println("countOfStudents:: "+countOfStudents);


        if (countOfStudents>no)
              return false;

        return true;
    }
    public static int MinimumPages(int[] arr,int no){
        int n=arr.length;
        int start=0,end=0;
        int smallestOfMaxNumber=-1;

        for(int i:arr){
            end+=i;
            start=Math.max(start,i);
        }

        System.out.println("start:: "+start);
        System.out.println("end:: "+end);
        while (start<=end){
            int mid=start+((end-start)/2);

            System.out.println("mid:: "+mid);

            if(isValidNoOfPages(arr,no,mid)){
                end=mid-1;
                smallestOfMaxNumber=mid;
            }
            else {
                System.out.println("else dor mid:: "+mid);
                start=mid+1;
            }

        }
        return smallestOfMaxNumber;
    }
    public static void main(String[]args){
        int arr[] =  {10,20,30,40};
        int no=2;
        System.out.println("============== "+MinimumPages(arr,no));
    }
}
