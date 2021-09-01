package Scaler.Array;

public class Search_in_aRowWiseAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int[][] a = { {1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int b=2;
        System.out.println(findPosition(a,b));
    }

    public static int findPosition(int[][] arr,int b){
        int row=0;
        int column= arr[0].length-1;
        int res=Integer.MAX_VALUE;
        while (row<arr.length && column>=0){
           // System.out.println(arr[row][column]);
            if (arr[row][column]==b){
                res=Math.min((row+1)*1009+(column+1),res);
                column--;
            }
            else if (b>arr[row][column]){
                row++;
            }
            else {
                column--;
            }
        }
//        System.out.println(res);
//        System.out.println(Integer.MAX_VALUE-Integer.MAX_VALUE);
        if (Integer.MAX_VALUE-Integer.MAX_VALUE==0)
            return res;
        else
            return -1;
    }
}
