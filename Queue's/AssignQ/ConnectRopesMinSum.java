

import java.util.*;
public class ConnectRopesMinSum{
    public static long minCost(long arr[], int n) 
    {
        // your code here
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long i:arr){
            pq.offer(i);
        }
        System.out.println(pq);
        long minCost=0;
        while(pq.size()>1){
            long first = pq.poll();
            long second = pq.poll();
            
            minCost+=(first+second);
            pq.offer(first+second);

            System.out.println(pq);
        }
       return  minCost;
    }
    public static void main(String args[]){
        long arr[]={4,2,3,6};
        int n = arr.length;
        System.out.println("Minimum Cost For Connecting Ropes: "+minCost(arr,n));
        // [2, 4, 3, 6]
        // [4, 6, 5]
        // [6, 9]
        // [15]
        // Minimum Cost For Connecting Ropes: 29
    }
}