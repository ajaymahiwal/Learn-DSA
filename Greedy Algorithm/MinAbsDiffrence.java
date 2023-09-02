

import java.util.*;
public class MinAbsDiffrence{
    public static void main(String args[]){

        int A[] = {6,4,2,5,1};
        int B[] = {2,5,1,5,3};
        int n = A.length; //length of both arrays is same 

        Arrays.sort(A);
        Arrays.sort(B);

        int minAbsDiffrence = 0;
        for(int i=0;i<n;i++){
            minAbsDiffrence+= A[i] - B[i];
        }
        System.out.println(minAbsDiffrence);
        // 2
    }
}