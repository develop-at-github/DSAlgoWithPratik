package test.practice.example.SlidingWindow;

import java.util.*;

public class SlidingWindow_fixed_2 {
    //find first Negative Number In Every Window of length k

    public static int[] findNegativeNumberInEveryWindow(int[]arr,int k){
        int i=0,j=0;
        int size=arr.length;
       // System.out.println("Started----------------");

        Queue<Integer> queue=new LinkedList<>();
        List<Integer> finalList=new ArrayList<>();

        while (j<size){
          //  System.out.println("in while----------------:: "+j);

            if(arr[j]<0) {
              //  System.out.println("negative:: "+arr[j]);
                queue.add(arr[j]);
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
              //  System.out.println("first peek::"+queue.peek());

                if(queue.size()==0)
                    finalList.add(0);
                else {
                    finalList.add(queue.peek());   //12, -1, -7, 8, -15, 30, 16, 28

                    if (queue.peek() == arr[i])
                        queue.poll();
                }
                j++;
                i++;
            }

        }


        int[] res=new int[finalList.size()];
        int x=0;
       // System.out.println("////////////////////////////////////////////////////////////");

        for(int y:finalList){
            // System.out.println(":: "+y);

             res[x]=y;
             x++;
         }


        return res;
    }

    public static void main(String[]args){
        int [] arr={12, -1, -7, 8, -15, 30, 16, 28};
        int windowSize=3;
       int[] tempArr= findNegativeNumberInEveryWindow(arr,windowSize);
        System.out.println(Arrays.toString(tempArr));
    }
}
