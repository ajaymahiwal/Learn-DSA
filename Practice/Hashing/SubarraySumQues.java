

import java.util.*;
class SubarraySumQues{
    public static void main(String args[]){
        int arr[] = {15,-2,2,-8,1,7,10};
        // int arr[] = {3,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;
        int len = 0;
        
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len,j - map.get(sum));
            }
            else{
                map.put(sum,j);
            }
        }

        System.out.println("Largest Subarray With Sum 0 => "+ len);



        //Q-2
        //Total Subarrays with sum K
        int arrr[] = {10,2,-2,-20,10};
        // int arrr[] = {1,2,3};
        int k = -10;

        HashMap<Integer,Integer> mapp = new HashMap<>();
        mapp.put(0,1); //If any element is equal to K

        sum = 0;
        int subAWithSumK = 0;

        for(int j=0;j<arrr.length;j++){
            sum+=arrr[j];
            if(mapp.containsKey(sum - k)){
                subAWithSumK += mapp.get(sum-k);
            }
            mapp.put(sum,mapp.getOrDefault(sum,0)+1);
        }

        System.out.println("Total SubArrays With Sum K = "+subAWithSumK);
    }
}