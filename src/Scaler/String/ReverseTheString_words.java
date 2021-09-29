package Scaler.String;

public class ReverseTheString_words {
    public static void main(String[] args) {
        String str = "the sky is blue";
            //        eulb si
            //        blue is sky the
        System.out.println(reverTheString(str));
    }

    public static void rerverse(char[] arr,int start,int end){
        while (start<end){
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static String reverTheString(String a){
        String str=a.trim();
        char[]arr=str.toCharArray();
        rerverse(arr,0,arr.length-1);
        int start=0,end=0;

        while (end<arr.length){
            if (arr[end]==' '){
                rerverse(arr,start,end-1);
                end++;
                start=end;
            }
            end++;
        }

        if (start!=end)
            rerverse(arr,start,end-1);

        return new String(arr);
    }
}
