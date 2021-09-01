package Scaler.Array;

public class MinDistanceBetweenMAX_and_MIN_no {
    public static void main(String[] args) {
        //int[] arr={1,2,3,1,3,4,4};
        int[] arr={4, 4, 4, 4, 4};
        System.out.println(getMinDistance(arr));
    }

    public static int getMinDistance(int[] arr){
        int minDistance=Integer.MAX_VALUE;

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        System.out.println(max);
        System.out.println(min);

        int latestMaxIndex=Integer.MAX_VALUE;
        int latestMinIndex=Integer.MAX_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]==max) {
                latestMaxIndex = i;
                if (latestMinIndex!=Integer.MAX_VALUE)
                    minDistance=Math.min(latestMaxIndex-latestMinIndex+1,minDistance);
            }
            else if (arr[i]==min) {
                latestMinIndex = i;
                if (latestMaxIndex!=Integer.MAX_VALUE)
                    minDistance=Math.min(latestMinIndex-latestMaxIndex+1,minDistance);
            }
        }

        return minDistance;
    }
}
