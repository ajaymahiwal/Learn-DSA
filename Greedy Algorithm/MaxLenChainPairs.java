/*You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.
A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
Return the length longest chain which can be formed. */

// time complexity: O(nLogn)
import java.util.*;
public class MaxLenChainPairs{
    public static void main(String args[]){
        int pairs[][]={{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};
        int n=pairs.length;

        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));

        int totalChains = 1;
        int chainEnd = pairs[0][1];
        System.out.println(pairs[0][0]+"----------"+pairs[0][1]);
        for(int i=1;i<n;i++){
            int nextChainStart = pairs[i][0];
            if(nextChainStart > chainEnd){
                totalChains++;
                chainEnd = pairs[i][1];
                System.out.println(nextChainStart+"----------"+chainEnd);
            }
        }
        System.out.println();
        System.out.println("Total Chain Who Will Make Max Length Chain:"+totalChains);
    }
}

// 5----------24
// 27----------40
// 50----------90

// Total Chain Who Will Make Max Length Chain:3