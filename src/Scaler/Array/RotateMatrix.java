package Scaler.Array;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] a= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int [][]arr=getRotatedMatrix_90(a);

        for (int[] arr1:arr){
            for (int arr2:arr1){
                System.out.print(arr2+" ");
            }
            System.out.println();
        }
    }

    public static int[][] getRotatedMatrix_90(int[][] arr){
        int noOfRow=arr.length;
        int noOfColumn=arr[0].length;

        for(int i=0;i< noOfRow;i++){
            for (int j=i;j<noOfColumn;j++){
                if(i!=j) {
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }

        for(int i=0;i< noOfRow;i++){
            for (int j=0;j<(noOfColumn/2);j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[i][noOfColumn-1-j];
                    arr[i][noOfColumn-1-j]=temp;
            }
        }

        return arr;
    }
}
