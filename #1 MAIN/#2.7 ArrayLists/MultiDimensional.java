


import java.util.*;
public class MultiDimensional{
    public static void main(String args[]){

        //main list
        ArrayList<ArrayList<Integer>> table=new ArrayList<>();
        //list 1
        ArrayList<Integer> list1=new ArrayList<>();
        // list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);

        //list2
        ArrayList<Integer> list2=new ArrayList<>();
        // list2.add(2); list2.add(4); list2.add(6); list2.add(8); list2.add(10);

        //list3
        ArrayList<Integer> list3=new ArrayList<>();
        // list3.add(3); list3.add(6); list3.add(9); list3.add(12); list3.add(15);

        
        for(int i=1;i<=5;i++){
            list1.add(i*1); // 1 2 3 4 5 
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }
        
         

        //making multi-dimensional ArrayList
        table.add(list1);
        table.add(list2);
        table.add(list3);
        System.out.println(table);
                    //i<3
        for(int i=0;i<table.size();i++){
            ArrayList<Integer> currList=table.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j));
            }
            System.out.println();
        }

    }
}