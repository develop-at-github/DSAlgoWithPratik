package Scaler.Array;

public class PascalTriangle {
    public static void main(String[] args) {
        int a=4;
        int [][]arr=getSpiralTrangle(a);

        for (int[] arr1:arr){
            for (int arr2:arr1){
                System.out.print(arr2+" ");
            }
            System.out.println();
        }
    }

    public static int[][] getSpiralTrangle(int a){
        int[][] arr=new int[a][a];
        int columNo=1;
        arr[0][0]=1;
        for (int i=1;i<a;i++){
            arr[i][0]=1;
            for (int j=1;j<columNo;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
            arr[i][columNo]=1;
            columNo++;
        }

        return arr;
    }
}
