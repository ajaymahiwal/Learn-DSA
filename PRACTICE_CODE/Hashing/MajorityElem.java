
import java.util.*;
class MajorityElem{
    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        //Brute force is counting sort thing but that is not optimized in term of time and space 
        // See Here
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            max = Math.max(max,i);
        }
        int count[] = new int[max+1];

        max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
            if(count[arr[i]]>max){
                max = arr[i];
            }
        }

        System.out.println("Maximum Times That Number Came In Array: "+max);

        //Using HashMap
        HashMap<Integer,Integer> map = new HashMap<>();
        max = Integer.MIN_VALUE;
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(max < map.get(i)){
                max = i;
            }
        }
        System.out.println("Maximum Times That Number Came In Array: "+max);

    }
}