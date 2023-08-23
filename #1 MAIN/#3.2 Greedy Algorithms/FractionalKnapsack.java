//Given weights and values of N items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.

// time complexity: O(nLogn)
import java.util.*;
public class FractionalKnapsack{
    public static void main(String args[]){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;//capacity
        
        double ratio[][]=new double[val.length][2];
        //1st col => index; //2nd col => ratio

        for(int i=0;i<val.length;i++){
                ratio[i][0]=i;
                ratio[i][1]=val[i]/(double)weight[i];
        }

        //asending order sorting
        Arrays.sort(ratio,Comparator.comparingDouble(o -> o[1]));

       int capacity=W;
       int finalVal=0;
       for(int i=ratio.length-1;i>=0;i--){
        int idx=(int)ratio[i][0];  //jiska idx per ratio jyda hoga vo idx hai ye
        if(capacity>=weight[idx]){
            finalVal+=val[idx];
            capacity-=weight[idx];
        }
        else{
            finalVal+=(ratio[i][1]*capacity);
            capacity=0;
            break;
        }
       }
        System.out.println("Total MaxValue is:"+finalVal);
    }
}