package Scaler.Array;

public class SpiralOrderMatrixII {
    public static void main(String[] args) {
        int a=4;
        int [][]arr=getSpiralMatrix(a);

        for (int[] arr1:arr){
            for (int arr2:arr1){
                System.out.print(arr2+" ");
            }
            System.out.println();
        }
    }

    public static int[][] getSpiralMatrix(int a){
        int[][] arr=new int[a][a];
        int row_start=0,column_start=0;
        int row_end=a-1,column_end=a-1;
        int num=1;

        while(row_start<row_end && column_start<column_end){
            for (int j=column_start;j<=column_end;j++){
                arr[row_start][j]=num;
                num++;
            }

            row_start++;

            for(int i=row_start;i<=row_end;i++){
                arr[i][column_end]=num;
                num++;
            }

            column_end--;

            for (int j=column_end;j>=column_start;j--){
                arr[row_end][j]=num;
                num++;
            }

            row_end--;

            for (int i=row_end;i>=row_start;i--){
                arr[i][column_start]=num;
                num++;
            }
            column_start++;
        }

        if (row_start==row_end || column_start==column_end){
            arr[row_start][column_start]=num;
        }
        return arr;
    }
}
