package Scaler.BitManupulation;

public class CountTotalSetBits {
    public static void main(String[] args) {
        int a=4;
        System.out.println(getTotalSetBits(a));
    }

    public static int getMaxPositionSetBit(int a){
        StringBuilder sb=new StringBuilder();
        while (a>0){
            sb.append(a%2);
            a=a/2;
        }
       // sb.append(1);
       // System.out.println(sb.reverse().toString());
        return sb.length();
    }
    public static int getTotalSetBits(int a){
        int count=0;

//        int columnOfMaxSetBit=getMaxPositionSetBit(a);
//        System.out.println("columnOfMaxSetBit: "+columnOfMaxSetBit); //3
//        for (int i=1,j=0;i<columnOfMaxSetBit && j<columnOfMaxSetBit-1;i++,j++){
//            count+=((a+1)/Math.pow(2,i))*Math.pow(2,j);
//
//            System.out.println("count: "+count);
//        }
//        //if ()
//        //count+=;

        System.out.println(6>>1);
        return count;
    }
}
