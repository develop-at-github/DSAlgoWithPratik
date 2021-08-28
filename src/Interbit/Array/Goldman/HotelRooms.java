package Interbit.Array.Goldman;
import java.util.*;

public class HotelRooms {
    public static boolean hotel(List<Integer> arrive, List<Integer> depart, int C) {
        int numOfPeoplePresent=0;
        int n=depart.size();

        List<int[]>interval=new ArrayList<>();

        for (int i=0;i<n;i++){
            interval.add(new int[]{arrive.get(i),1});
            interval.add(new int[]{depart.get(i),0});
        }



        Collections.sort(interval,(e1,e2)-> e1[0]-e2[0]);

        int maxActive=0;
        for(int[]arr : interval){
            System.out.println(Arrays.toString(arr));
            System.out.println(arr[1]);
            if(arr[1]==1){
                numOfPeoplePresent++;
                maxActive=Math.max(maxActive,numOfPeoplePresent);

                if (maxActive>C)
                    return false;
            }
            else {
                numOfPeoplePresent--;
            }
            System.out.println("numOfPeoplePresent: "+maxActive);

        }

        return true;
    }
    public static void main(String[] args) {
//        List<Integer>A = Arrays.asList( 9, 47, 17, 39, 35, 35, 20, 18, 15, 34, 11, 2, 45, 46, 15, 33, 47, 47, 10, 11, 27);
//        List<Integer>B = Arrays.asList( 32, 82, 39, 86, 81, 58, 64, 53, 40, 76, 40, 46, 63, 88, 56, 52, 50, 72, 22, 19, 38);
        List<Integer>A = Arrays.asList(40,18);
        List<Integer>B = Arrays.asList(40,43);
        int C = 1;
        System.out.println(hotel(A,B,C));
    }
}


//public class Solution {
//    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
//        Collections.sort(arrive); //18,40
//        Collections.sort(depart); //40,43
//        int roomsRequired=0,i=0,j=0;
//        while(i<arrive.size()  && j<arrive.size() && roomsRequired<=K){
//            if(arrive.get(i)<depart.get(j) ){
//                i++;
//                roomsRequired++;
//            }else{
//                j++;
//                roomsRequired--;
//            }
//        }
//        if(roomsRequired<=K){
//            return true;
//        }else{
//            return false;
//        }
//    }
//}

