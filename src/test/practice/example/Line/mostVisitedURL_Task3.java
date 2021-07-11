package test.practice.example.Line;

import java.util.*;
import java.util.stream.Collectors;

public class mostVisitedURL_Task3 {
    public static String[] mostVistedURL(int n,String[] str){

       // List<String> list=new ArrayList<>();
        Map<String,Integer> map=new HashMap<>();

        for(String s:str){
            String arr[]=s.split(" ");

            if (Integer.valueOf(arr[1])==200){
                int count=map.getOrDefault(arr[2],0);
                map.put(arr[2],count+1);
            }

        }

        for (String s:map.keySet()){
            System.out.println(s+" = "+map.get(s));
        }


        System.out.println("before ::::::::::::::::::::");
        List<String> list=new ArrayList<>();

        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        for (String s:sortedMap.keySet()){
            if(list.contains(sortedMap.get(s))){
                System.out.println(sortedMap.get(s));
              String[]tempStr=new String[2];
               tempStr[0]=s;
               tempStr[1]=list.get(sortedMap.get(s));
               Arrays.sort(tempStr);

               list.remove(sortedMap.get(s));

               list.add(tempStr[0]);
               list.add(tempStr[1]);
            }
               else
                   list.add(s);
            System.out.println(s+" = "+sortedMap.get(s));
        }


        System.out.println("after ::::::::::::::::::::");
        String[] ans=new String[list.size()];

        for (int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=15;
        String[] str={"10.20.31.12 200 http://example.com/index",
                "10.20.31.12 200 http://example.com/index",
                "10.20.31.15 200 http://example.com/welcome",
                "10.20.31.15 404 http://example.com/welcome",
                "10.20.31.15 200 http://example.com/welcome",
                "10.20.31.30 555 http://example.com/old",
                "10.20.31.30 200 http://example.com/old"
        };

        System.out.println(mostVistedURL(n,str));
    }
}
