

//time complexity: O(nLogn)
import java.util.*;
public class IndianCoins{
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        //sort coins array in descending order
        Arrays.sort(coins,Comparator.reverseOrder());
        int amount=590;
        int countOfCoins=0;

        ArrayList<Integer> ans=new ArrayList<>();
        
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }
            }
        }

        System.out.println("Total Minimum Coins Used= "+countOfCoins);
        //print used coins
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
/**
Total Minimum Coins Used= 4
500 50 20 20 
 */