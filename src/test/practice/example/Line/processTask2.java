package test.practice.example.Line;

import java.util.*;

public class processTask2 {

    public static String runningProcesses(int t,String[] str){

        List<String> list=new ArrayList<>();

        for(String s:str){
            String arr[]=s.split(" ");

            if (Integer.valueOf(arr[0])<=t){
                if (arr[2].equals("running")){
                    list.add(arr[1]);
                }
                else if (arr[2].equals("waiting") || arr[2].equals("terminated"))
                    list.remove(arr[1]);
            }

        }

        return list.size()==1 ? list.get(0):"-1";
    }
    public static void main(String[] args) {
        int t=15;
        String[] str={"0 A created",
                       "1 B created",
                        "10 A running",
                        "12 B waiting",
                        "13 B running",
                        "14 A waiting",
                        "17 B terminated",
                        "18 A terminated"
                        };

        System.out.println(runningProcesses(t,str));
    }
}
