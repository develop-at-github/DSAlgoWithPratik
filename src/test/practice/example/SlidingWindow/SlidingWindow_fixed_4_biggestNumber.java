package test.practice.example.SlidingWindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindow_fixed_4_biggestNumber {

    public static ArrayList<Integer> findMaxNumWindow(int [] arr, int k){
        int i=0,j=0;  // start and end point of the window
        int size=arr.length;
        //int maxNum=Integer.MIN_VALUE;
        //int secondMax=Integer.MIN_VALUE;
        ArrayList<Integer> arrayList=new ArrayList<>();
        Queue<Integer> queue=new LinkedList<>();

        while (j<size){
          //  queue.add(arr[j]);
            if(!queue.isEmpty() && arr[j]>queue.peek()) {
                while (queue.size() > 0)
                    queue.poll();
            }
            queue.add(arr[j]);


            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                arrayList.add(queue.peek());

                if(!queue.isEmpty() && queue.peek()==arr[i])
                    queue.poll();

                j++;
                i++;
            }
        }

        return arrayList;
    }
    public static void main(String[]args){
        int [] arr={1, 3, -1, -3, 5, 3, 6, 7 };
        int windowSize=3;

        for(int i:findMaxNumWindow(arr,windowSize))
            System.out.println(":: "+i);
    }
}
