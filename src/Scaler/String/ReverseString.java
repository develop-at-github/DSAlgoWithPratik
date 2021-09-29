package Scaler.String;

public class ReverseString {
    public static void main(String[] args) {
        String str="scaler";
        System.out.println(reverseString(str));
    }

    public static String reverseString(String str){
        char[] arr=str.toCharArray();

        for (int i=0;i<str.length()/2;i++){
            char temp=arr[i];
            arr[i]=arr[str.length()-1-i];
            arr[str.length()-1-i]=temp;
        }

        return new String(arr);
    }
}
