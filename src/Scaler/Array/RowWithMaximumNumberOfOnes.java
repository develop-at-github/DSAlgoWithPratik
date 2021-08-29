package Scaler.Array;

public class RowWithMaximumNumberOfOnes {
    public static void main(String[] args) {
        int[][] arr= {{0, 0, 1},{0, 0, 1},{0, 1, 1}};
        System.out.println(getRow(arr));
    }

    public static int getRow(int[][]arr){
        for (int i=0;i<arr[0].length;i++) { //column
            for(int j=0;j<arr.length;j++){ // row
                if (arr[j][i]==1) {
//                    System.out.println("row: "+j);
//                    System.out.println("column: "+i);
                    return j;
                }
            }
        }
        return 0;
    }

}
