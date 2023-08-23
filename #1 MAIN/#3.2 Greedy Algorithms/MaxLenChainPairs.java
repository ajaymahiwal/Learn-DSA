/*You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.
A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
Return the length longest chain which can be formed. */

// time complexity: O(nLogn)
import java.util.*;
public class MaxLenChainPairs{
    public static void main(String args[]){
        int pairs[][]={{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        int n=pairs.length;
        //sort 2nd numbers of pairs
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int chainLen=1;
        int pairEnd=pairs[0][1]; //last selected pair end / Chain end

        for(int i=1;i<n;i++){
            if(pairs[i][0] > pairEnd){ //first no. is always smaller than second no.
                chainLen++;
                pairEnd=pairs[i][1];
            }
        }
        System.out.println("Maximum Length Chain Of Pairs:"+chainLen);
    }
}