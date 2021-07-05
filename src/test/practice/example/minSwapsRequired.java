package test.practice.example;

public class minSwapsRequired {
    public static int minSwaps(Character[]arr){
        int swaps=0;
        int windowSize=0;
        int start=0,end=0;
        int n=arr.length;

        int totalCountInAWindow=0;
        int maxCountOfX=Integer.MIN_VALUE;


        for(Character c:arr){
            if (c=='x')
                windowSize++;
        }

        while (end<n){
            if(windowSize > end-start+1){
                if (arr[end]=='x')
                    totalCountInAWindow++;
            }
            else if(windowSize==end-start+1){
                if (arr[end]=='x')
                    totalCountInAWindow++;

                if(totalCountInAWindow>maxCountOfX){
                    maxCountOfX=totalCountInAWindow;
                    swaps=windowSize-maxCountOfX;
                }

                if (arr[start]=='x'){
                    totalCountInAWindow--;
                }
                start++;
            }

            end++;
        }
        return swaps;
    }

    public static void main(String[]args){
      //  Character[] arr={'x',' ','x',' ','x'};
        Character[] arr={' ',' ','x',' ','x','x',' ',' ','x','x'};

        System.out.println(minSwaps(arr));
    }
}
