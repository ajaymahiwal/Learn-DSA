

import java.util.*;
class UnionAndIntersection{
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set1 = new HashSet<>();
        for(int i:arr1){
            set1.add(i);
        }
        for(int i:arr2){
            set1.add(i);
        }

        System.out.println("Total Union Elements: "+ set1.size());
        for(Integer key:set1){
            System.out.print(key+", ");
        }

        int interSecEleCount = 0;
        set1.clear();

        for(int i:arr1){
            set1.add(i);
        }

        System.out.println();
        System.out.println("Inetrsection Elements:");
        for(int i:arr2){
            if(set1.contains(i)){
                interSecEleCount++;
                System.out.print(i+", ");
                set1.remove(i);
            }
        }
        System.out.println();
        System.out.println("Total Elements Which is Common: "+interSecEleCount);
    }
}