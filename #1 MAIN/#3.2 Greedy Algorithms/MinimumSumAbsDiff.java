//Given two arrays a[] and b[] of equal length n. The task is to pair each element of array a to an element in array b, such that sum S of absolute differences of all the pairs is minimum.

//Time complexity: O(nlogn)
import java.util.*;
public class MinimumSumAbsDiff{
    public static void main(String args[]){
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};
        //sort both arrays
        Arrays.sort(A);
        Arrays.sort(B);
        
        int minDiff=0;
        for(int i=0;i<A.length;i++){
            minDiff+=Math.abs(A[i]-B[i]);
        }

        System.out.println("Minimum Absolute Diffrence:"+ minDiff);
    }
}