package Scaler.Array;

public class AntiDiagonals {
    public static void main(String[] args) {
        int[][] a= {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

        int [][]arr=antiDiagonalMatrix(a);

        for (int[] arr1:arr){
            for (int arr2:arr1){
                System.out.print(arr2+" ");
            }
            System.out.println();
        }
    }

    public static int[][] antiDiagonalMatrix(int[][]arr){
        int noOfRows=arr.length;
//        int noOfColumns=arr[0].length;

        int[][] res=new int[noOfRows*2 - 1][noOfRows];

//        int stage = 0;
//        int iValue=0;
//        int j=0;
//        int stageWiseIJValues=0;
//        while (stage<res.length) {
//            if (stage<noOfRows) {
//                int positon = 0;
//                for (int i = iValue,j = stageWiseIJValues; i <= stageWiseIJValues && j >= 0; i++, j--) {
//                    res[stageWiseIJValues][positon] = arr[i][j];
//                    positon++;
//                }
//                stageWiseIJValues++;
//                if(stageWiseIJValues==noOfRows)
//                    stageWiseIJValues-=2;
//            }
//            else
//                iValue++;
//            else {
//                int temp=i+1;
//                int positon = 0;
//                for (i=temp, j = stageWiseIJValues; i <= stageWiseIJValues && j >= 0; i++, j--) {
//                    res[stageWiseIJValues][positon] = arr[i][j];
//                    positon++;
//                }
//                stageWiseIJValues--;
//            }
//            stage++;
//        }

        int i_end=0;
        int j_end=0;
        int stage=0;
        while (stage<(noOfRows*2 - 1)) {
            int position=0;
            for (int i = i_end, j = j_end; i <= j_end && j >= 0; i++, j--) {
                res[stage][position] = arr[i][j];
                position++;
            }

            if (j_end+1==noOfRows){
                stage++;
                break;
            }
            else {
                j_end++;
            }
            stage++;
        }

        int rowStart=1;
        j_end=noOfRows-1;

        while (stage<(noOfRows*2 - 1)) {
            int position = 0;
            for (int i = rowStart, j = j_end; i <= j_end && j >= 0; i++, j--) {
                res[stage][position] = arr[i][j];
                position++;
            }
            rowStart++;
            stage++;
        }

        return res;
    }
}
