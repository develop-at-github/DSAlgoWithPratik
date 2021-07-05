package test.practice.example.BinarySearch;

public class NextAlfabeticalElement {

    public static char findCeilOfNum_ForAlphabate(char[] arr,char chr){
        int n=arr.length;
        int start=0,end=n-1;
        char nextChar='{';

        while (start<=end){                   // 'a','c','f','h'
            int mid=start+((end-start)/2);
            System.out.println("mid:"+arr[mid]);

            if(arr[mid]<chr)
                start=mid+1;
            else if (arr[mid]>chr || arr[mid]==chr){
                if(arr[mid]<nextChar)
                    nextChar =arr[mid];

                end=mid-1;
            }
        }
        return nextChar;
    }
    public static void main(String[]args){
        char arr[] =  {'c','f','j'};
        char chr='a';
        System.out.println(findCeilOfNum_ForAlphabate(arr,chr));
    }
}
