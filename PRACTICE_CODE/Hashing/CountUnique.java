

import java.util.*;
class CountUnique{
    public static void main(String args[]){
        int arr[] = {4,3,2,5,6,7,3,2,2,2,1,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println("Total Uniques Elements: "+ set.size());
    }
}