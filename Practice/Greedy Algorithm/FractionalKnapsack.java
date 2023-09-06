//Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.

// time complexity: O(nLogn)

import java.util.*;
public class FractionalKnapsack{
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int n = val.length;
        int W = 50; //Capacity

        double ratio[][] = new double[n][2];

        for(int i=0;i<n;i++){
            ratio[i][0] = i; //index
            ratio[i][1] = val[i] / weight[i];
        }

        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1])); //ascending order Ratio sorted

        int finalAnswer = 0; //maximum value in Knapsack of items weight
        for(int i=n-1;i>=0;i--){
            int idx = (int) ratio[i][0];
            if(W >= weight[idx]){
                finalAnswer  += val[idx];
                W-= weight[idx];
            }else{
                finalAnswer += (ratio[i][1] * W);
                W-= weight[idx];
                break;
            }
        }

        System.out.println("Maximum Value of Knapsack can be = "+finalAnswer);
    }
}

// Maximum Value of Knapsack can be = 240