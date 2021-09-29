package Scaler.ProblemSolving;

public class Bulbs {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1};
        System.out.println(bulbs(A));
    }
    public static int bulbs(int[] arr) {
        int noOfTimesButtonsClicked=0;

        for (int i=0;i<arr.length;i++){
            if (noOfTimesButtonsClicked % 2 !=0)
                arr[i]= 1-arr[i];

            if (arr[i]==0)
                noOfTimesButtonsClicked++;
        }

        return noOfTimesButtonsClicked;
    }
}
