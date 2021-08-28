package Interbit.Array.Amezon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetMatrixO {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> rows=new ArrayList<>();
        //rows.add(Arrays.asList(1,0,1));
        Integer[] colum1={0,1,1};
        ArrayList<Integer> columOne=new ArrayList<>();
        Integer[] colum2={1,1,1};
        ArrayList<Integer> columTwo=new ArrayList<>();
        Integer[] colum3={1,1,1};
        ArrayList<Integer> columThree=new ArrayList<>();

        Collections.addAll(columOne,colum1);
        Collections.addAll(columTwo,colum2);
        Collections.addAll(columThree,colum3);
        rows.add(columOne);
        rows.add(columTwo);
        rows.add(columThree);

        for (ArrayList<Integer> i: rows){
            for (int j:i)
            {  System.out.print(j);}
            System.out.println();
        }
        System.out.println("-----------------------------------------------------");

        setZeroes(rows);
        for (ArrayList<Integer> i: rows){
            for (int j:i)
            {  System.out.print(j);}
            System.out.println();
        }

    }

    public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int[]row=new int[a.get(0).size()];
        int[]column=new int[a.size()];
        Arrays.fill(row,-1);
        Arrays.fill(column,-1);

        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(0).size();j++){
                if (a.get(i).get(j)==0){
                    row[j]=0;
                    column[i]=0;
                }
            }
        }

        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(0).size();j++){
                if (row[j]==0 || column[i]==0){
                    a.get(i).set(j,0);
                }
            }
        }
    }
}
