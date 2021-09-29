package Scaler.ProblemSolving;

public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        int[]arr={-7, 1, 5, 2, -4, 3, 0};

        System.out.println(equilibriumIndex(arr));

    }

    public static int equilibriumIndex(int[]arr){
        int right_totalSum=arr[0];
        for (int i=1;i<arr.length;i++){
            right_totalSum+=arr[i];
        }

        int leftSum=0;
        for (int i=0;i<arr.length;i++){
            right_totalSum-=arr[i];

            if (leftSum==right_totalSum)
                return i;

            leftSum+=arr[i];
        }
        return -1;
    }
}
