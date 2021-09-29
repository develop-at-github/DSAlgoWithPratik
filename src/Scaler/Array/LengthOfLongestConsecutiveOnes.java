package Scaler.Array;

public class LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        String str="1101001100101110";
        //String str="010100110101";  //4
        System.out.println(getCountOf1(str));
    }

    public static int getCountOf1(String str){
        int countOfTotal_1s=0;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
            countOfTotal_1s+= Integer.parseInt(String.valueOf(arr[i]));

        //countOfTotal_1s=str.length()-countOfTotal_1s;
        System.out.println("countOfTotal_1s:: "+countOfTotal_1s);
        int count=0;
        int maxCount=Integer.MIN_VALUE;
        int start=0,end=0;
        while (end<arr.length){
            if (end-start+1<countOfTotal_1s) {
                count += Integer.parseInt(String.valueOf(arr[end]));
                System.out.println("+++ adding count +++    end: "+end+" >> count:: "+count);
            }
            else if(end-start+1==countOfTotal_1s){
                System.out.println("end: "+end+" >> count:: "+count);
                count += Integer.parseInt(String.valueOf(arr[end]));
                maxCount=Math.max(maxCount,count);
                count-=Integer.parseInt(String.valueOf(arr[start]));
                start++;
            }
            end++;
        }

        return maxCount;
    }
}
